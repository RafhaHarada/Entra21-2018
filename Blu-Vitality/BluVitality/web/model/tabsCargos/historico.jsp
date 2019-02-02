<%-- 
    Document   : historico
    Created on : 30/09/2018, 13:20:44
    Author     : Gus
--%>

<div id="Comum4" class="col s12 container white">
    <table class="striped teal lighten-4">
        <thead>
            <tr>
                <th>Descrição</th>
                <th>Médico</th>
                <th>Exame/Consulta</th>
                <th>Data</th>
                <th>Horário</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <%
                    DateFormat formatoEn4 = new SimpleDateFormat("yyyy/MM/dd");
                    DateFormat formatoBr4 = new SimpleDateFormat("dd/MM/yyyy");
                    Date hoje4 = new Date();
                    List<ExpedicaoBean> expedicoes4 = new ExpedicaoDAO().obterTodosPorUsuario(usuario.getId());
                    for (int i = 0; i < expedicoes4.size(); i++) {
                        if (expedicoes4.get(i).getData_expedicao().before(formatoEn4.parse(formatoEn4.format(hoje4)))) {
                            String especialidade4 = expedicoes4.get(i).getFuncionario().getCargo().getEspecialidade();
                            String medico4 = expedicoes4.get(i).getFuncionario().getUsuario().getNome();
                            String medicoEspecialidade4 = medico4 + "|" + especialidade4;
                            String data4 = formatoBr4.format(expedicoes4.get(i).getData_expedicao());
                %>
            <tr>
                <td><%=expedicoes4.get(i).getTipo()%></td>
                <td><%=medico4%></td>
                <td><%=expedicoes4.get(i).getNome()%></td>
                <td><%=data4%></td>
                <td><%=expedicoes4.get(i).getHora_expedicao()%></td>
            </tr>
            <%
                    }
                }
            %>
        </tbody>
    </table>                                   
</div>