<%-- 
    Document   : agendamentosfuturos
    Created on : 20/09/2018, 10:15:04
    Author     : Luana Patricia Duarte (luanapatricia.blu@hotmail.com)
                 Nattana Matos (nattana.matos@Outlook.pt)
--%>

<%@page import="java.util.List"%>
<%@page import="br.com.Sistema.Bean.QuartoBean"%>
<%@page import="br.com.Sistema.DAO.QuartoDAO"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page import="br.com.Sistema.DAO.ExpedicaoDAO"%>
<%@page import="br.com.Sistema.Bean.ExpedicaoBean"%>
<div id="Funcionarios3" class="col s12 container white">
    <table class="striped teal lighten-4">
        <thead>
            <tr>
                <th>Tipo</th>
                <th>Paciente</th>
                <th>Exame/Consulta</th>
                <th>Data</th>
                <th>Hora</th>
                <th></th>

            </tr>
        </thead>
        <tbody>
            <%                DateFormat formatoEn2 = new SimpleDateFormat("yyyy/MM/dd");
                DateFormat formatoBr2 = new SimpleDateFormat("dd/MM/yyyy");
                Date hoje2 = new Date();
                List<ExpedicaoBean> expedicoes2 = new ExpedicaoDAO().obterTodosPorFuncionario(usuario.getId());
                for (int i = 0; i < expedicoes2.size(); i++) {
                    if (expedicoes2.get(i).getData_expedicao().after(formatoEn2.parse(formatoEn2.format(hoje2)))) {

                        String data2 = formatoBr2.format(expedicoes2.get(i).getData_expedicao());
                        
            %>
            <tr>
                <td><%=expedicoes2.get(i).getTipo()%></td>
                <td><%=expedicoes2.get(i).getUsuario().getNome()%></td>
                <td><%=expedicoes2.get(i).getNome()%></td>
                <td><%=data2%></td>
                <td><%=expedicoes2.get(i).getHora_expedicao()%></td>
                <td>
                    <a href="/expedicao/excluir?id=<%=expedicoes2.get(i).getId()%>"  class="tooltipped" data-position="left" data-tooltip="Cancelar registro?"><i class="material-icons">delete_forever</i></a>
                </td>
            </tr>
            <%}
                }%>
        </tbody>
    </table>
</div>