package robot

import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import robotG.flow.Programme
import robotG.robot.RobotPackage

import static extension robot.NXCCodeGenerator.*

// import static extension robot.ProgramUnitAspect.*

public class Main {
	def static void main(String... args) {
		// TODO set the path to your model
		val program = load("src/resources/robot.xmi")
		val ctx = new ContextNCX
		val code = program.generateCode(ctx)
		println(code)
		// Save the code into a text file:
//		var Path newFile = Paths.get("./Program1.nxc")
//		Files.deleteIfExists(newFile)
//		newFile = Files.createFile(newFile)
//		val buffer = Files.newBufferedWriter(newFile, Charset.defaultCharset)
//		buffer.append(ctx.header).append('\n').append(code)
//		buffer.flush
//		try { buffer.close }catch(IOException ex) { ex.printStackTrace }
	}
	
	// The returned value must be the root class of your metamodel
	def static Programme load(String path) {
		val rs = new ResourceSetImpl
		// init the required package
		// TODO: to change to use the package of your metamodel.
		RobotPackage.eINSTANCE.eClass
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		val res = rs.getResource(URI.createURI(path), true)
		res.load(Collections.emptyMap)
		// TODO: change the class
		res.contents.filter(Programme).head
	}
}
