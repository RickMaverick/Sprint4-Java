package br.com.fiap.resource;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.beans.DecisaoModal;
import br.com.fiap.bo.DecisaoModalBo;

@Path("/atualizar")
public class DecisaoModalResource {
	
	DecisaoModalBo decisaoBO = new DecisaoModalBo();

	//ATUALIZAR
	@PUT
	@Path("/{id_veiculo}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizarRs(DecisaoModal variaveis, @PathParam("id_veiculo") int id_veiculo) throws ClassNotFoundException, SQLException {
		decisaoBO.atualizarBo(variaveis);
		return Response.ok().build();
	}
	
}
