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
<div id="Funcionarios4" class="col s12 container white">
    <table class="striped teal lighten-4">
        <thead>
            <tr>
                <th>Tipo</th>
                <th>Paciente</th>
                <th>Médico</th>
                <th>Exame/Consulta</th>
                <th>Data</th>
                <th>Hora</th>
                <th></th>

            </tr>
        </thead>
        <tbody>
            <%  DateFormat formatoEn = new SimpleDateFormat("yyyy/MM/dd");
                DateFormat formatoBr = new SimpleDateFormat("dd/MM/yyyy");
                Date hoje = new Date();
                List<ExpedicaoBean> expedicoes3 = new ExpedicaoDAO().obterTodos();
                for (int i = 0; i < expedicoes3.size(); i++) {
                    if (expedicoes3.get(i).getData_expedicao().after(formatoEn.parse(formatoEn.format(hoje)))) {
                        String especialidade3 = expedicoes3.get(i).getFuncionario().getCargo().getEspecialidade();
                        String medico3 = expedicoes3.get(i).getFuncionario().getUsuario().getNome();
                        String medicoEspecialidade3 = medico3 + "|" + especialidade3;

                        String data = formatoBr.format(expedicoes3.get(i).getData_expedicao());
            %>
            <tr>
                <td><%=expedicoes3.get(i).getTipo()%></td>
                <td><%=expedicoes3.get(i).getUsuario().getNome()%></td>
                <td><%=medico3%></td>
                <td><%=expedicoes3.get(i).getNome()%></td>
                <td><%=data%></td>
                <td><%=expedicoes3.get(i).getHora_expedicao()%></td>
                <td>
                    <a href="/expedicao/excluir?id=<%=expedicoes3.get(i).getId()%>"  class="tooltipped" data-position="left" data-tooltip="Cancelar registro?"><i class="material-icons">delete_forever</i></a>
                </td>
            </tr>
            <%}
                }%>
        </tbody>
    </table>
</div>