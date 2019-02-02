<%-- 
    Document   : agendamentosfuturos
    Created on : 20/09/2018, 10:15:04
    Author     : Luana Patricia Duarte (luanapatricia.blu@hotmail.com)
                 Nattana Matos (nattana.matos@Outlook.pt)
                 Rafael Alipio Harada (rafhaharada@gmail.com)
--%>

<%@page import="java.util.List"%>
<%@page import="br.com.Sistema.Bean.QuartoBean"%>
<%@page import="br.com.Sistema.DAO.QuartoDAO"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page import="br.com.Sistema.DAO.ExpedicaoDAO"%>
<%@page import="br.com.Sistema.Bean.ExpedicaoBean"%>
<div id="Comum3" class="col s12 container white">
    <table class="striped teal lighten-4">
        <thead>
            <tr>
                <th>Tipo</th>
                <th>Médico</th>
                <th>Exame/Consulta</th>
                <th>Data</th>
                <th>Hora</th>
                <th></th>

            </tr>
        </thead>
        <tbody>
            <%                DateFormat formatoEn = new SimpleDateFormat("yyyy/MM/dd");
                DateFormat formatoBr = new SimpleDateFormat("dd/MM/yyyy");
                Date hoje = new Date();
                List<ExpedicaoBean> expedicoes = new ExpedicaoDAO().obterTodosPorUsuario(usuario.getId());
                for (int i = 0; i < expedicoes.size(); i++) {
                    if (expedicoes.get(i).getData_expedicao().after(formatoEn.parse(formatoEn.format(hoje)))) {
                        String especialidade = expedicoes.get(i).getFuncionario().getCargo().getEspecialidade();
                        String medico = expedicoes.get(i).getFuncionario().getUsuario().getNome();
                        String medicoEspecialidade = medico + "|" + especialidade;

                        String data = formatoBr.format(expedicoes.get(i).getData_expedicao());
            %>
            <tr>
                <td><%=expedicoes.get(i).getTipo()%></td>
                <td><%=medico%></td>
                <td><%=expedicoes.get(i).getNome()%></td>
                <td><%=data%></td>
                <td><%=expedicoes.get(i).getHora_expedicao()%></td>
                <td>
                    <a href="/expedicao/excluir?id=<%=expedicoes.get(i).getId()%>"  class="tooltipped" data-position="left" data-tooltip="Cancelar registro?"><i class="material-icons">delete_forever</i></a>
                </td>
            </tr>
            <%}
                }%>
        </tbody>
    </table>
</div>