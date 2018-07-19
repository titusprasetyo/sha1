package xyz.titus.sha1;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sha1Controller {
	/*
	@RequestMapping(method=RequestMethod.POST, value="/get")
	@Path("{text}/{key}")
	public Response getSha1(@PathParam(value="text") String text, @PathParam(value="key") String key) {
		
		return Response.status(200).entity("Text|key" + text+"|"+key).build();
	}
	*/
	
	@RequestMapping(method=RequestMethod.GET, value="/hello")
	//@Path("{text}/{key}")
	public String getSha1() {
		
		return "Hello";
	}
}
