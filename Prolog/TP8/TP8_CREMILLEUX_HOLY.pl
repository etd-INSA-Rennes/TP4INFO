/**
TP 8 Traitement Automatique de la Langue (TAL) - Prolog

@author Damien Cr�milleux
@author Lauriane Holy
@version Annee scolaire 2013/2014
*/


/*
===============================================================================
===============================================================================
 D�finition des pr�dicats
===============================================================================
*/
% Afin de simplifier la correction, merci de conserver dans votre grammaire
% l'ordre ci-dessous
 

%% phrase_simple
%% gp_nominal 
%% gp_verbal
%% gp_prepositionnel
%% relatif

%% article
%% nom_commun
%% nom_propre
%% adjectif
%% prep       
%% verbe
%% pronom

%% Question 1.1

%% Grammaire
%% phrase_simple ::= gp_nominal gp_verbal | 
%%                   gp_nominal gp_verbal gp_prepositionnel

%% gp_nominal ::= article nom_commun relatif | 
%%                article nom_commun |
%%                nom_propre relatif | 
%%                nom_propre
%%                article nom_commun adjectif relatif | 
%%                article nom_commun adjectif |
 
%% gp_verbal ::= verbe |
%%               verbe groupe_nominal

%% gp_prepositionnel ::= prep gp_nominal

%% relatif ::= pronom gp_verbal

%% article ::= "le"| "les" | "la" | "un" | "une"
%% nom_commun ::= "chien" | "enfants" | "rue" | "femme" | "pull" | "steak"
%% nom_propre ::= "Paul"
%% adjectif ::= "noir"
%% prep ::= "dans"
%% verbe ::= "aboie" | "jouent" | "marche" | "mange" | "porte"
%% pronom ::= "qui"


%% Question 2.1

%% phrase_simple(L,R) :- 
%% 	gp_nominal(L,L1),
%% 	gp_verbal(L1,R).

%% phrase_simple(L,R) :- 
%% 	gp_nominal(L,L1),
%% 	gp_verbal(L1,L2),
%% 	gp_prepositionnel(L2,R).


%% gp_nominal(L,R) :-
%% 	article(L,L1),
%% 	nom_commun(L1,L2),
%% 	relatif(L2,R).

%% gp_nominal(L,R) :-
%% 	article(L,L1),
%% 	nom_commun(L1,R).

%% gp_nominal(L,R) :-
%% 	nom_propre(L,L1),
%% 	relatif(L1,R).

%% gp_nominal(L,R) :-
%% 	nom_propre(L,R).

%% gp_nominal(L,R) :-
%% 	article(L,L1),
%% 	nom_commun(L1,L2),
%% 	adjectif(L2,L3),
%% 	relatif(L3,R).

%% gp_nominal(L,R) :-
%% 	article(L,L1),
%% 	nom_commun(L1,L2),
%% 	adjectif(L2,R).

%% gp_verbal(L,R) :- 
%% 	verbe(L,R).

%% gp_verbal(L,R) :- 
%% 	verbe(L,L1),
%% 	gp_nominal(L1,R).

%% gp_prepositionnel(L,R) :- 
%% 	prep(L,L1),
%% 	gp_nominal(L1,R).

%% relatif(L,R) :-
%% 	pronom(L,L1),
%% 	gp_verbal(L1,R).

%% article([le|L],L).
%% article([les|L],L).
%% article([la|L],L).
%% article([un|L],L).
%% article([une|L],L).

%% nom_commun([chien|L],L).
%% nom_commun([enfants|L],L).
%% nom_commun([rue|L],L).
%% nom_commun([femme|L],L).
%% nom_commun([pull|L],L).
%% nom_commun([steak|L],L).

%% nom_propre([paul|L],L).

%% adjectif([noir|L],L).

%% prep([dans|L],L).

%% verbe([aboie|L],L).
%% verbe([jouent|L],L).
%% verbe([marche|L],L).
%% verbe([mange|L],L).
%% verbe([porte|L],L).
	
%% pronom([qui|L],L).
 

/* Tests

[eclipse 28]: analyse(X),phrase_simple(X,[]).

X = [le, chien, aboie]
Yes (0.00s cpu, solution 1, maybe more) ? ;

X = [les, enfants, jouent]
Yes (0.00s cpu, solution 2, maybe more) ? ;

X = [paul, marche, dans, la, rue]
Yes (0.00s cpu, solution 3, maybe more) ? ;

X = [les, chien, aboie]
Yes (0.00s cpu, solution 4, maybe more) ? ;

X = [la, femme, qui, porte, un, pull, noir, mange, un, chien]
Yes (0.00s cpu, solution 5, maybe more) ? ;

No (0.00s cpu)



[eclipse 30]: phrase_simple(X,[]).

X = [le, chien, qui, aboie, aboie]
Yes (0.01s cpu, solution 1, maybe more) ? ;

X = [le, chien, qui, aboie, jouent]
Yes (0.01s cpu, solution 2, maybe more) ? ;

X = [le, chien, qui, aboie, marche]
Yes (0.01s cpu, solution 3, maybe more) ? ;

X = [le, chien, qui, aboie, mange]
Yes (0.01s cpu, solution 4, maybe more) ? ;

X = [le, chien, qui, aboie, porte]
Yes (0.01s cpu, solution 5, maybe more) ? ;

X = [le, chien, qui, aboie, aboie, le, chien, qui, aboie]
Yes (0.01s cpu, solution 6, maybe more) ? ;

X = [le, chien, qui, aboie, aboie, le, chien, qui, jouent]
Yes (0.01s cpu, solution 7, maybe more) ? ;

X = [le, chien, qui, aboie, aboie, le, chien, qui, marche]
Yes (0.01s cpu, solution 8, maybe more) ? ;

X = [le, chien, qui, aboie, aboie, le, chien, qui, mange]
Yes (0.01s cpu, solution 9, maybe more) ? ;

X = [le, chien, qui, aboie, aboie, le, chien, qui, porte]
Yes (0.01s cpu, solution 10, maybe more) ? ;

X = [le, chien, qui, aboie, aboie, le, chien, qui, aboie, le, chien, qui, aboie]

.......

*/

%% %% Question 2.2
%% phrase_simple(L,R,phr(Res1,Res2)) :- 
%% 	gp_nominal(L,L1,Res1),
%% 	gp_verbal(L1,R,Res2).

%% phrase_simple(L,R,phr(Res1,Res2,Res3)) :- 
%% 	gp_nominal(L,L1,Res1),
%% 	gp_verbal(L1,L2,Res2),
%% 	gp_prepositionnel(L2,R,Res3).


%% gp_nominal(L,R,gn(Res1,Res2,Res3)) :-
%% 	article(L,L1,Res1),
%% 	nom_commun(L1,L2,Res2),
%% 	relatif(L2,R,Res3).

%% gp_nominal(L,R,gn(Res1,Res2)) :-
%% 	article(L,L1,Res1),
%% 	nom_commun(L1,R,Res2).

%% gp_nominal(L,R,gn(Res1,Res2)) :-
%% 	nom_propre(L,L1,Res1),
%% 	relatif(L1,R,Res2).

%% gp_nominal(L,R,gn(Res)) :-
%% 	nom_propre(L,R,Res).

%% gp_nominal(L,R,gn(Res1,Res2,Res3,Res4)) :-
%% 	article(L,L1,Res1),
%% 	nom_commun(L1,L2,Res2),
%% 	adjectif(L2,L3,Res3),
%% 	relatif(L3,R,Res4).

%% gp_nominal(L,R,gn(Res1,Res2,Res3)) :-
%% 	article(L,L1,Res1),
%% 	nom_commun(L1,L2,Res2),
%% 	adjectif(L2,R,Res3).

%% gp_verbal(L,R,gv(Res)) :- 
%% 	verbe(L,R,Res).

%% gp_verbal(L,R,gv(Res1,Res2)) :- 
%% 	verbe(L,L1,Res1),
%% 	gp_nominal(L1,R,Res2).

%% gp_prepositionnel(L,R,gp(Res1,Res2)) :- 
%% 	prep(L,L1,Res1),
%% 	gp_nominal(L1,R,Res2).

%% relatif(L,R,rel(Res1,Res2)) :-
%% 	pronom(L,L1,Res1),
%% 	gp_verbal(L1,R,Res2).

%% article([le|L],L,art(le)).
%% article([les|L],L,art(les)).
%% article([la|L],L,art(la)).
%% article([un|L],L,art(un)).
%% article([une|L],L,art(une)).

%% nom_commun([chien|L],L,nom_com(chien)).
%% nom_commun([enfants|L],L,nom_com(enfants)).
%% nom_commun([rue|L],L,nom_com(rue)).
%% nom_commun([femme|L],L,nom_com(femme)).
%% nom_commun([pull|L],L,nom_com(pull)).
%% nom_commun([steak|L],L,nom_com(steak)).

%% nom_propre([paul|L],L,nom_prop(paul)).

%% adjectif([noir|L],L,adj(noir)).

%% prep([dans|L],L,prep(dans)).

%% verbe([aboie|L],L,verbe(aboie)).
%% verbe([jouent|L],L,verbe(jouent)).
%% verbe([marche|L],L,verbe(marche)).
%% verbe([mange|L],L,verbe(mange)).
%% verbe([porte|L],L,verbe(porte)).
	
%% pronom([qui|L],L,pronom(qui)).

%% analyse(Phrase,Res) :- phrase_simple(Phrase,[],Res).
      
/* Tests

[eclipse 7]: analyse([paul,qui,porte,un,pull,noir,mange,un,steak],R).

R = phr(gn(nom_prop(paul), rel(pronom(qui), gv(verbe(porte), gn(art(un), nom_com(pull), adj(noir))))), gv(verbe(mange), gn(art(un), nom_com(steak))))
Yes (0.00s cpu, solution 1, maybe more) ? ;

No (0.00s cpu)
[eclipse 8]: analyse(X),phrase_simple(X,[],Res).

X = [le, chien, aboie]
Res = phr(gn(art(le), nom_com(chien)), gv(verbe(aboie)))
Yes (0.00s cpu, solution 1, maybe more) ? ;

X = [les, enfants, jouent]
Res = phr(gn(art(les), nom_com(enfants)), gv(verbe(jouent)))
Yes (0.00s cpu, solution 2, maybe more) ? ;

X = [paul, marche, dans, la, rue]
Res = phr(gn(nom_prop(paul)), gv(verbe(marche)), gp(prep(dans), gn(art(la), nom_com(rue))))
Yes (0.00s cpu, solution 3, maybe more) ? ;

X = [les, chien, aboie]
Res = phr(gn(art(les), nom_com(chien)), gv(verbe(aboie)))
Yes (0.00s cpu, solution 4, maybe more) ? ;

X = [la, femme, qui, porte, un, pull, noir, mange, un, chien]
Res = phr(gn(art(la), nom_com(femme), rel(pronom(qui), gv(verbe(porte), gn(art(un), nom_com(pull), adj(noir))))), gv(verbe(mange), gn(art(un), nom_com(chien))))
Yes (0.00s cpu, solution 5, maybe more) ? ;

No (0.00s cpu)


*/

/*

%% Question 2.3

phrase_simple(L,R,phr(Res1,Res2)) :- 
	gp_nominal(L,L1,Res1,Nombre),
	gp_verbal(L1,R,Res2,Nombre).

phrase_simple(L,R,phr(Res1,Res2,Res3)) :- 
	gp_nominal(L,L1,Res1,Nombre),
	gp_verbal(L1,L2,Res2,Nombre),
	gp_prepositionnel(L2,R,Res3).


gp_nominal(L,R,gn(Res1,Res2,Res3),Nombre) :-
	article(L,L1,Res1,Genre,Nombre),
	nom_commun(L1,L2,Res2,Genre,Nombre),
	relatif(L2,R,Res3).

gp_nominal(L,R,gn(Res1,Res2),Nombre) :-
	article(L,L1,Res1,Genre,Nombre),
	nom_commun(L1,R,Res2,Genre,Nombre).

gp_nominal(L,R,gn(Res1,Res2),Nombre) :-
	nom_propre(L,L1,Res1,_,Nombre),
	relatif(L1,R,Res2).

gp_nominal(L,R,gn(Res),Nombre) :-
	nom_propre(L,R,Res,_,Nombre).

gp_nominal(L,R,gn(Res1,Res2,Res3,Res4),Nombre) :-
	article(L,L1,Res1,Genre,Nombre),
	nom_commun(L1,L2,Res2,Genre,Nombre),
	adjectif(L2,L3,Res3,Genre,Nombre),
	relatif(L3,R,Res4).

gp_nominal(L,R,gn(Res1,Res2,Res3),Nombre) :-
	article(L,L1,Res1,Genre,Nombre),
	nom_commun(L1,L2,Res2,Genre,Nombre),
	adjectif(L2,R,Res3,Genre,Nombre).

gp_verbal(L,R,gv(Res),Nombre) :- 
	verbe(L,R,Res,Nombre).

gp_verbal(L,R,gv(Res1,Res2),Nombre) :- 
	verbe(L,L1,Res1,Nombre),
	gp_nominal(L1,R,Res2,Nombre).

gp_prepositionnel(L,R,gp(Res1,Res2)) :- 
	prep(L,L1,Res1),
	gp_nominal(L1,R,Res2).

relatif(L,R,rel(Res1,Res2)) :-
	pronom(L,L1,Res1),
	gp_verbal(L1,R,Res2).

article([le|L],L,art(le),m,sing).
article([les|L],L,art(les),_,plu).
article([la|L],L,art(la),f,sing).
article([un|L],L,art(un),m,sing).
article([une|L],L,art(une),f,sing).

nom_commun([chien|L],L,nom_com(chien),m,sing).
nom_commun([enfants|L],L,nom_com(enfants),m,plu).
nom_commun([rue|L],L,nom_com(rue),f,sing).
nom_commun([femme|L],L,nom_com(femme),f,sing).
nom_commun([pull|L],L,nom_com(pull),m,sing).
nom_commun([steack|L],L,nom_com(steak),m,sing).

nom_propre([paul|L],L,nom_prop(paul),m,sing).

adjectif([noir|L],L,adj(noir),f,sing).

prep([dans|L],L,prep(dans)).

verbe([aboie|L],L,verbe(aboie),sing).
verbe([jouent|L],L,verbe(jouent),plu).
verbe([marche|L],L,verbe(marche),sing).
verbe([mange|L],L,verbe(mange),sing).
verbe([porte|L],L,verbe(porte),sing).
	
pronom([qui|L],L,pronom(qui)).

analyse(Phrase,Res) :- phrase_simple(Phrase,[],Res).
*/

/* Test

[eclipse 15]: analyse(X),phrase_simple(X,[],Res).

X = [le, chien, aboie]
Res = phr(gn(art(le), nom_com(chien)), gv(verbe(aboie)))
Yes (0.00s cpu, solution 1, maybe more) ? ;

X = [les, enfants, jouent]
Res = phr(gn(art(les), nom_com(enfants)), gv(verbe(jouent)))
Yes (0.00s cpu, solution 2, maybe more) ? ;

X = [paul, marche, dans, la, rue]
Res = phr(gn(nom_prop(paul)), gv(verbe(marche)), gp(prep(dans), gn(art(la), nom_com(rue))))
Yes (0.00s cpu, solution 3, maybe more) ? ;

X = [la, femme, qui, porte, un, pull, noir, mange, un, steack]
Res = phr(gn(art(la), nom_com(femme), rel(pronom(qui), gv(verbe(porte), gn(art(un), nom_com(pull), adj(noir))))), gv(verbe(mange), gn(art(un), nom_com(steak))))
Yes (0.00s cpu, solution 4, maybe more) ? ;

X = [la, femme, qui, porte, un, pull, noir, mange, un, chien]
Res = phr(gn(art(la), nom_com(femme), rel(pronom(qui), gv(verbe(porte), gn(art(un), nom_com(pull), adj(noir))))), gv(verbe(mange), gn(art(un), nom_com(chien))))
Yes (0.00s cpu, solution 5, maybe more) ? ;

No (0.00s cpu)

[eclipse 16]: phrase_simple([les,chiens,aboie],[],Res).

No (0.00s cpu)

*/


phrase_simple(L,R,phr(Res1,Res2)) :- 
	gp_nominal(L,L1,Res1,Nombre,Sujet),
	gp_verbal(L1,R,Res2,Nombre,SujetL,_),
	member(Sujet,SujetL).

phrase_simple(L,R,phr(Res1,Res2,Res3)) :- 
	gp_nominal(L,L1,Res1,Nombre,Sujet),
	gp_verbal(L1,L2,Res2,Nombre,SujetL,ActionL),
	gp_prepositionnel(L2,R,Res3,Action),
	member(Sujet,SujetL),
	member(Action,ActionL).


gp_nominal(L,R,gn(Res1,Res2,Res3),Nombre,Type) :-
	article(L,L1,Res1,Genre,Nombre),
	nom_commun(L1,L2,Res2,Genre,Nombre,Type),
	relatif(L2,R,Res3,_).

gp_nominal(L,R,gn(Res1,Res2),Nombre,Type) :-
	article(L,L1,Res1,Genre,Nombre),
	nom_commun(L1,R,Res2,Genre,Nombre,Type).

gp_nominal(L,R,gn(Res1,Res2),Nombre,Type) :-
	nom_propre(L,L1,Res1,_,Nombre,Type),
	relatif(L1,R,Res2,TypeL),
	member(Type,TypeL).

gp_nominal(L,R,gn(Res),Nombre,Type) :-
	nom_propre(L,R,Res,_,Nombre,Type).

gp_nominal(L,R,gn(Res1,Res2,Res3,Res4),Nombre,Type) :-
	article(L,L1,Res1,Genre,Nombre),
	nom_commun(L1,L2,Res2,Genre,Nombre,Type),
	adjectif(L2,L3,Res3,Genre,Nombre,TypeADJ),
	member(Type,TypeADJ),
	relatif(L3,R,Res4,TypeL),
	member(Type,TypeL).

gp_nominal(L,R,gn(Res1,Res2,Res3),Nombre,Type) :-
	article(L,L1,Res1,Genre,Nombre),
	nom_commun(L1,L2,Res2,Genre,Nombre,Type),
	adjectif(L2,R,Res3,Genre,Nombre,TypeADJ),
	member(Type,TypeADJ).

gp_verbal(L,R,gv(Res),Nombre,SujetL,ActionL) :- 
	verbe(L,R,Res,Nombre,SujetL,ActionL).

gp_verbal(L,R,gv(Res1,Res2),Nombre,SujetL,ActionL) :- 
	verbe(L,L1,Res1,Nombre,SujetL,ActionL),
	gp_nominal(L1,R,Res2,Nombre,ActionGN),
	member(ActionGN,ActionL).

gp_prepositionnel(L,R,gp(Res1,Res2),Type) :- 
	prep(L,L1,Res1,Type),
	gp_nominal(L1,R,Res2,_,Type).

relatif(L,R,rel(Res1,Res2),TypeL) :-
	pronom(L,L1,Res1),
	gp_verbal(L1,R,Res2,_,TypeL,_).

article([le|L],L,art(le),m,sing).
article([les|L],L,art(les),_,plu).
article([la|L],L,art(la),f,sing).
article([un|L],L,art(un),m,sing).
article([une|L],L,art(une),f,sing).

nom_commun([chien|L],L,nom_com(chien),m,sing, animal).
nom_commun([enfants|L],L,nom_com(enfants),m,plu, humain).
nom_commun([rue|L],L,nom_com(rue),f,sing, lieu).
nom_commun([femme|L],L,nom_com(femme),f,sing, humain).
nom_commun([pull|L],L,nom_com(pull),m,sing, vetement).
nom_commun([steack|L],L,nom_com(steack),m,sing, nourriture).

nom_propre([paul|L],L,nom_prop(paul),m,sing, humain).

adjectif([noir|L],L,adj(noir),m,sing,[humain,vetement,nourriture,animal]).

prep([dans|L],L,prep(dans),lieu).

verbe([aboie|L],L,verbe(aboie),sing,[animal],[lieu]).
verbe([jouent|L],L,verbe(jouent),plu,[humain,animal],[lieu]).
verbe([marche|L],L,verbe(marche),sing,[humain],[lieu]).
verbe([mange|L],L,verbe(mange),sing,[humain, animal],[nourriture]).
verbe([porte|L],L,verbe(porte),sing,[humain, animal], [vetement]).
	
pronom([qui|L],L,pronom(qui)).

analyse(Phrase,Res) :- phrase_simple(Phrase,[],Res).

%% Test

[eclipse 11]: analyse(X),analyse(X,Res).

X = [le, chien, aboie]
Res = phr(gn(art(le), nom_com(chien)), gv(verbe(aboie)))
Yes (0.00s cpu, solution 1, maybe more) ? ;

X = [les, enfants, jouent]
Res = phr(gn(art(les), nom_com(enfants)), gv(verbe(jouent)))
Yes (0.00s cpu, solution 2, maybe more) ? ;

X = [paul, marche, dans, la, rue]
Res = phr(gn(nom_prop(paul)), gv(verbe(marche)), gp(prep(dans), gn(art(la), nom_com(rue))))
Yes (0.00s cpu, solution 3, maybe more) ? ;

X = [la, femme, porte, un, pull]
Res = phr(gn(art(la), nom_com(femme)), gv(verbe(porte), gn(art(un), nom_com(pull))))
Yes (0.00s cpu, solution 4, maybe more) ? ;

X = [la, femme, qui, porte, un, pull, noir, mange, un, steack]
Res = phr(gn(art(la), nom_com(femme), rel(pronom(qui), gv(verbe(porte), gn(art(un), nom_com(pull), adj(noir))))), gv(verbe(mange), gn(art(un), nom_com(steack))))
Yes (0.00s cpu, solution 5, maybe more) ? ;

No (0.00s cpu)


% Quelques phrases de test � copier coller pour vous faire gagner du temps, mais
% n'h�sitez pas � en d�finir d'autres

analyse([le,chien,aboie]).
analyse([les,enfants,jouent]).
analyse([paul,marche,dans,la,rue]).
analyse([la,femme,porte,un,pull]).
analyse([la,femme,qui,porte,un,pull,noir,mange,un,steack]).
analyse([les,chien,aboie]).
analyse([la,femme,qui,porte,un,pull,noir,mange,un,chien]).              

