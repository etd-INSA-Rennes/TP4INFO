%% TP4
%% Damien Crémilleux - Lauriane Holy

:-lib(ic).
%%:-lib(ic_symbolic).

%% Question 4.1
%%%%%%%%%%%%%%%
%% getData(?TailleEquipes, ?NbEquipes, ?CapaBateaux, ?NbBateaux, ? NbConf) : unifie les variables passées en paramètres avec les données du problème

getData(TailleEquipes, NbEquipes, CapaBateaux, NbBateaux, NbConf):-
        TailleEquipes = [](5,5,2,1),
        CapaBateaux= [](7,6,5),
        dim(TailleEquipes, [NbEquipes]),
        dim(CapaBateaux,[NbBateaux]),
        NbConf is 3.


%% Question 4.2
%%%%%%%%%%%%%%%
%% defineVars(?T, +NbEquipes, +NbConf, +NbBateaux) : unifie T au tableau des variables et contraint le domaine des variables

defineVars(T, NbEquipes, NbConf, NbBateaux):-
        dim(T, [NbEquipes, NbConf]),
        T #:: 1..NbBateaux.

%% Question 4.3
%%%%%%%%%%%%%%%
%% getVarList(+T, ?L) : construit la liste L des variables contenues dans le tableau T.

getVarList(T, L) :-
        dim(T,[NbEquipes,NbConf]),
        (multifor([I,J],[NbConf,NbEquipes],[1,1],[-1,-1]),
         param(T),
         fromto([], In, Out, L)
         do
            (V is T[J,I],
             Out = [V|In]
            )   
        ).


%% Question 4.4
%%%%%%%%%%%%%%%
%% solve(?T) : resolution du problème avec les contraintes de domaine/

solve(T):-
        getData(_TailleEquipes,NbEquipes,_CapaBateaux,NbBateaux,NbConf),
        defineVars(T, NbEquipes, NbConf, NbBateaux),
        getVarList(T,L),
        labeling(L).

%% Question 4.5
%%%%%%%%%%%%%%%
%% pasMemeBateaux(+T, +NbEquipes, +NbConf) : une même équipe ne peut pas se retrouver deux fois sur le meme bateau

pasMemeBateaux(T,_NbEquipes, _NbConf):-
        foreacharg(Ligne, T) do
            alldifferent(Ligne).


solve2(T):-
        getData(_TailleEquipes,NbEquipes,_CapaBateaux,NbBateaux,NbConf),
        defineVars(T, NbEquipes, NbConf, NbBateaux),
        getVarList(T,L),
        pasMemeBateaux(T,NbEquipes,NbConf),
        labeling(L).


% Question 4.6
%%%%%%%%%%%%%%%
%% pasMemePartenaires(+T, +NbEquipes, +NbConf) : une meme équipe ne se retrouve pas deux fois avec la meme équipe

pasMemePartenaires(T, NbEquipes, NbConf):-
        (for(E1,1,NbEquipes), param(T,NbConf, NbEquipes)
        do
            (for(E2,E1+1, NbEquipes), param(T, NbConf, E1)
                                      do
                (for(C1,1,NbConf), param(T, E1, E2, NbConf)
                                   do
                    (for(C2, C1+1, NbConf), param(T, E1, E2, C1)
                                            do
                        (T[E1,C1] #= T[E2,C1]) => (T[E1,C2] #\= T[E2,C2])
                    )
                )
            )
        ).

solve3(T):-
        getData(_TailleEquipes,NbEquipes,_CapaBateaux,NbBateaux,NbConf),
        defineVars(T, NbEquipes, NbConf, NbBateaux),
        getVarList(T,L),
        pasMemeBateaux(T,NbEquipes,NbConf),
        pasMemePartenaires(T, NbEquipes, NbConf),
        labeling(L).	



% Question 4.7
%%%%%%%%%%%%%%%
%% capaBateaux(+T, +TailleEquipes, +NbEquipes, +CapaBateaux, +NbBateaux, +NbConf)  
capaBateaux(T,_TailleEquipes, NbEquipes,_CapaBateaux, NbBateaux, NbConf) :-
        (multifor([I,J],[1,1],[NbConf,NbBateaux]), param(NbEquipes, T) do
            capaBateauxConfrontation(T, NbEquipes, I, Liste),
            sommeCapa(Liste, J, 1, Res),
            tailleBateau(J, Taille),
            Res #=< Taille
        ).

%% Renvoie la liste des bateaux pour une confrontation (la colonne correpondant à la confrontation)
capaBateauxConfrontation(T, NbEquipes, NumConfrontation, L) :-
        (for(I,1,NbEquipes),
         fromto([], In, Out, L), param(T,NumConfrontation)
                                 do
            Elem is T[I,NumConfrontation],
            append(In,[Elem],Out)
        ).

%% sommeCapa(+ListeBateau, +NumBateau, +NumEquipe, -Res) : renvoie pour un bateau le nombre de personne à bord
sommeCapa([],_NumBateau,_NumEquipe,0).
sommeCapa([NumBateau|Reste],NumBateau,NumEquipe,Res) :-
        !,
        tailleEquipe(NumEquipe,ResTemp),
        NumEquipe2 is NumEquipe + 1,
        sommeCapa(Reste,NumBateau,NumEquipe2,ResTemp2),
        Res is ResTemp + ResTemp2.

sommeCapa([_NumBateau2|Reste],NumBateau,NumEquipe,Res) :-
        NumEquipe2 is NumEquipe + 1,
        sommeCapa(Reste,NumBateau,NumEquipe2,Res).

%% tailleEquipe(+NumEquipe,-Capacite) : indique le nombre de personnes d'une équipe 
tailleEquipe(NumEquipe, Taille) :-
        getData(TailleEquipes, _NbEquipes, _CapaBateaux, _NbBateaux, _NbConf),
        Taille is TailleEquipes[NumEquipe].

tailleBateau(NumBateau, Taille) :-
        getData(_TailleEquipes, _NbEquipes, CapaBateaux, _NbBateaux, _NbConf),
        Taille is CapaBateaux[NumBateau].

solve4(T):-
        getData(_TailleEquipes,NbEquipes,_CapaBateaux,NbBateaux,NbConf),
        defineVars(T, NbEquipes, NbConf, NbBateaux),
        getVarList(T,L),
        pasMemeBateaux(T,NbEquipes,NbConf),
        pasMemePartenaires(T, NbEquipes, NbConf),
        labeling(L),
        capaBateaux(T, _TailleEquipes, NbEquipes, _CapaBateaux, NbBateaux, NbConf).


%% Question 4.8
%% getVarListAlt(+T,?L) : résolution du problème de taille réelle
%%getVarListAlt(T,L):-

%%Nous ne voyons pas comment implémenter ce labeling.


%%%%%%%%
% TEST %
%%%%%%%%

/*

%% Question 4.1
%%%%%%%%%%%%%%%
[eclipse 11]: getData(TailleEquipes,NbEquipes,CapaBateaux,NbBateaux,NbConf).

TailleEquipes = [](5, 5, 2, 1)
NbEquipes = 4
CapaBateaux = [](7, 6, 5)
NbBateaux = 3
NbConf = 3


%% Question 4.2
%%%%%%%%%%%%%%%
[eclipse 15]: getData(TailleEquipes,NbEquipes,CapaBateaux,NbBateaux,NbConf), defineVars(T, NbEquipes, NbConf, NbBateaux).
lists.eco  loaded in 0.01 seconds

TailleEquipes = [](5, 5, 2, 1)
NbEquipes = 4
CapaBateaux = [](7, 6, 5)
NbBateaux = 3
NbConf = 3
T = []([](_11384{1 .. 3}, _11402{1 .. 3}, _11420{1 .. 3}, _11438{1 .. 3}), [](_11456{1 .. 3}, _11474{1 .. 3}, _11492{1 .. 3}, _11510{1 .. 3}), [](_11528{1 .. 3}, _11546{1 .. 3}, _11564{1 .. 3}, _11582{1 .. 3}))
Yes (0.01s cpu)


%% Question 4.3
%%%%%%%%%%%%%%%
[eclipse 33]: getData(TailleEquipes,NbEquipes,CapaBateaux,NbBateaux,NbConf), defineVars(T, NbEquipes, NbConf, NbBateaux), getVarList(T,L).

TailleEquipes = [](5, 5, 2, 1)
NbEquipes = 4
CapaBateaux = [](7, 6, 5)
NbBateaux = 3
NbConf = 3
T = []([](_572{1 .. 3}, _590{1 .. 3}, _608{1 .. 3}, _626{1 .. 3}), [](_644{1 .. 3}, _662{1 .. 3}, _680{1 .. 3}, _698{1 .. 3}), [](_716{1 .. 3}, _734{1 .. 3}, _752{1 .. 3}, _770{1 .. 3}))
L = [_572{1 .. 3}, _644{1 .. 3}, _716{1 .. 3}, _590{1 .. 3}, _662{1 .. 3}, _734{1 .. 3}, _608{1 .. 3}, _680{1 .. 3}, _752{1 .. 3}, _626{1 .. 3}, _698{1 .. 3}, _770{1 .. 3}]
Yes (0.00s cpu)

%% Question 4.4
%%%%%%%%%%%%%%%
[eclipse 38]: solve(T).

T = []([](1, 1, 1, 1), [](1, 1, 1, 1), [](1, 1, 1, 1))
Yes (0.00s cpu, solution 1, maybe more) ? ;

T = []([](1, 1, 1, 1), [](1, 1, 1, 1), [](1, 1, 1, 2))
Yes (0.00s cpu, solution 2, maybe more) ? ;

T = []([](1, 1, 1, 1), [](1, 1, 1, 1), [](1, 1, 1, 3))
Yes (0.00s cpu, solution 3, maybe more) ? ;

T = []([](1, 1, 1, 1), [](1, 1, 1, 2), [](1, 1, 1, 1))
Yes (0.00s cpu, solution 4, maybe more) ? ;

T = []([](1, 1, 1, 1), [](1, 1, 1, 2), [](1, 1, 1, 2))
Yes (0.00s cpu, solution 5, maybe more) ? ;

T = []([](1, 1, 1, 1), [](1, 1, 1, 2), [](1, 1, 1, 3))
Yes (0.00s cpu, solution 6, maybe more) ? ;

T = []([](1, 1, 1, 1), [](1, 1, 1, 3), [](1, 1, 1, 1))
Yes (0.00s cpu, solution 7, maybe more) ? 


%% Question 4.5
%%%%%%%%%%%%%%%
[eclipse 53]: solve2(T).

T = []([](1, 2, 3), [](1, 2, 3), [](1, 2, 3), [](1, 2, 3))
Yes (0.00s cpu, solution 1, maybe more) ? ;

T = []([](1, 2, 3), [](1, 2, 3), [](1, 2, 3), [](1, 3, 2))
Yes (0.00s cpu, solution 2, maybe more) ? ;

T = []([](1, 2, 3), [](1, 2, 3), [](1, 3, 2), [](1, 2, 3))
Yes (0.00s cpu, solution 3, maybe more) ? ;

T = []([](1, 2, 3), [](1, 2, 3), [](1, 3, 2), [](1, 3, 2))
Yes (0.00s cpu, solution 4, maybe more) ? ;

T = []([](1, 2, 3), [](1, 3, 2), [](1, 2, 3), [](1, 2, 3))
Yes (0.00s cpu, solution 5, maybe more) ? ;

T = []([](1, 2, 3), [](1, 3, 2), [](1, 2, 3), [](1, 3, 2))
Yes (0.00s cpu, solution 6, maybe more) ? ;

T = []([](1, 2, 3), [](1, 3, 2), [](1, 3, 2), [](1, 2, 3))
Yes (0.00s cpu, solution 7, maybe more) ? ;


%% Question 4.6
%%%%%%%%%%%%%%%

[eclipse 11]: solve3(T).

T = []([](1, 2, 3), [](1, 3, 2), [](2, 1, 3), [](2, 3, 1))
Yes (0.00s cpu, solution 1, maybe more) ? ;

T = []([](1, 2, 3), [](1, 3, 2), [](2, 3, 1), [](2, 1, 3))
Yes (0.00s cpu, solution 2, maybe more) ? ;

T = []([](1, 3, 2), [](1, 2, 3), [](2, 1, 3), [](2, 3, 1))
Yes (0.00s cpu, solution 3, maybe more) ? ;

T = []([](1, 3, 2), [](1, 2, 3), [](2, 3, 1), [](2, 1, 3))
Yes (0.00s cpu, solution 4, maybe more) ? ;


%% Question 4.7
%%%%%%%%%%%%%%%
[eclipse 13]: solve4(T).

T = []([](1, 2, 3), [](2, 3, 1), [](3, 1, 2), [](3, 2, 1))
Yes (0.01s cpu, solution 1, maybe more) ? ;

T = []([](1, 3, 2), [](2, 1, 3), [](3, 2, 1), [](3, 1, 2))
Yes (0.01s cpu, solution 2, maybe more) ? ;

T = []([](1, 2, 3), [](3, 1, 2), [](2, 3, 1), [](1, 3, 2))
Yes (0.01s cpu, solution 3, maybe more) ? ;



*/