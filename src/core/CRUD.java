package core;
import java.io.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

	@Path("/test")
	public class CRUD {
	       File f = new File("hw_CRUD.txt");
	       @POST
	       @Path("/create") // http://api.nakhabtsev.com:89/RWS_CRUD/microsoft/test/create
	       @Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	       @Produces("text/plan")
	       public Response postCreate(Body b) throws IOException {
	              String id = b.getEmployeeID();
	              String name = b.getEmployeeName();
	              String email = b.getEmployeeEmail();
	              ////////////////////////////////////////////////////////////////////////
	              String content = id + "," + name + "," + email;
	              if (!f.exists()) {f.createNewFile();}
	              FileWriter fw = new FileWriter(f.getAbsoluteFile(), true);
	              BufferedWriter bw = new BufferedWriter(fw);
	              bw.write(content);
	              bw.newLine();
	              bw.close();
	              ////////////////////////////////////////////////////////////////////////
	              String output = "id: " + id + " name: " + name + " email: " + email;
	              return Response.status(201).entity(output).build(); }
	       @GET
	       @Path("/{param}") // http://api.nakhabtsev.com:89/RWS_CRUD/microsoft/test/Dima is the best Java Automation Engineer!
	       @Produces("text/plan")
	       public Response getOne(@PathParam("param") String msg) {
	              String output = msg;
	              return Response.status(200).entity(output).build(); }
	       @GET
	       @Path("/all") //http://api.nakhabtsev.com:89/RWS_CRUD/microsoft/test/all
	       @Produces("text/plan")
	       public InputStream getFileInputStream() throws Exception {
	              FileInputStream output = new FileInputStream(f);
	              return output; }
	       @PUT
	       @Path("/{param}") //http://api.nakhabtsev.com:89/RWS_CRUD/microsoft/test/Dima is the best Java Automation Engineer!
	       @Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	       @Produces("text/plan")
	       public Response putMsg(@PathParam("param") String msg) {
	              String output = msg;
	              return Response.status(200).entity(output).build(); }
	       @DELETE
	       @Path("/{param}")
	       @Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	       @Produces("text/plan")
	       public Response deleteMsg(@PathParam("param") String msg) {
	              String output = msg+" is deleted";
	      return Response.status(200).entity(output).build();}}

