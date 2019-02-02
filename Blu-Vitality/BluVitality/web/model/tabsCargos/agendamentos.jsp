<%-- 
    Document   : agendamentos
    Created on : 20/09/2018, 09:54:20
    Author     : Luana Patricia Duarte (luanapatricia.blu@hotmail.com)
                 Nattana Matos (nattana.matos@Outlook.pt)
--%>


<div id="Comum2" class="scrollBarOnDiv row">
    <div class="row">
        <nav>
            <div class="nav-wrapper teal lighten-4">
                <span class="teal-text teatl lighten-4">Você deseja agendar<span class="red-text">*</span></span>
            </div>
        </nav>
        <div>
            <label>
                <input class="with-gap exameRadio" name="group1" type="radio">
                <span class="teal-text">Exame</span>
            </label>
        </div>
        <div>
            <label>
                <input class="with-gap consultaRadio" name="group1" type="radio" >
                <span class="teal-text">Consulta</span>
            </label>
        </div>
        <!--Exame-->
        <div class="agendarE container">
            <form action="/expedicao/store" method="POST">
                <div class="row">
                    <div class="input-field col s12">
                        <input id="exame-cadastro-tipo" type="text" name="tipo" value="Exame" readonly>
                        <label for="exame-cadastro-tipo" class="teal-text lighten-4">Agendarei um</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <%
                            if (usuario.isColaborador()) {
                                
                                if (cargoDoFuncionario.equals("Recepcionista")) {
                                    List<UsuarioBean> usuariosE = new UsuarioDAO().obterTodos();
                        %>
                        <select id="exame-cadastro-id-usuario" name="id-usuario" required="required">
                            <option value="" disabled selected>Agende aqui para</option>
                            <% for (int i = 0; i < usuariosE.size(); i++) {
                            %>
                            <option value="<%=usuariosE.get(i).getId()%>"><%=usuariosE.get(i).getNome()%></option>
                            <%
                                }
                            } else {
                            %>
                            <select id="exame-cadastro-id-usuario" name="id-usuario" required="required">
                                <option value="<%=usuario.getId()%>" selected ><%=usuario.getNome()%></option>
                            </select>
                            <%
                                }
                            %>
                        </select>
                        <%
                        } else {
                        %>
                        <select id="exame-cadastro-id-usuario" name="id-usuario" required="required">
                            <option value="<%=usuario.getId()%>" selected ><%=usuario.getNome()%></option>
                        </select>
                        <%
                            }
                        %>
                        <label for="exame-cadastro-id-usuario" class="teal-text">Paciente</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <select id="exame-cadastro-id-funcionario" name="id-funcionario" required="required">
                            <option value="" disabled selected>Ser atendido por</option>
                            <%
                                List<FuncionarioBean> funcionariosE = new FuncionarioDAO().obterTodos();
                                for (int i = 0; i < funcionariosE.size(); i++) {
                                    if (funcionariosE.get(i).getCargo().getNome().equals("Medico")) {
                            %>
                            <option value="<%=funcionariosE.get(i).getId()%>"><%=funcionariosE.get(i).getUsuario().getNome()%></option>
                            <%
                                    }
                                }
                            %>
                        </select>
                        <label for="exame-cadastro-id-funcionario" class="teal-text">Médico</label>
                    </div>
                </div>
                <div class="row">
                    <div class="col s12">
                        <label class="teal-text teatl lighten-4" for="exame-cadastro-nome">Escolha o Exame<span class="red-text">*</span></label>
                        <select id="exame-cadastro-nome" name="nome" >
                            <option value="" disabled selected>Exame</option>
                            <option value="Cardiologico">Cardiológico</option>
                            <option value="Diagnostico por Imagem">Diagnóstico por Imagem</option>
                            <option value="Endoscopia">Endoscopia</option>
                            <option value="Laboratoriais">Laboratoriais</option>
                        </select>
                    </div>
                </div>
                <div class="row">
                    <div class="col s5 left">
                        <input id="exame-cadastro-data" type="text" name="data" class="datepicker" required="required">
                        <label class="teal-text teatl lighten-4" for="exame-cadastro-data">Qual a data de sua preferência?<span class="red-text">*</span></label>
                    </div>
                    <div class="col s5 right">
                        <label for="exame-cadastro-hora" class="teal-text">Escolha o horário desejado</label>
                        <select id="exame-cadastro-hora" name="hora" class="browser-default row" required="required">
                            <option value="" disabled selected>Horário</option>
                            <% for (int i = 5; i <= 20; i++) {
                            %>
                            <option value="<%if (i < 10) {%>0<%=i%><%} else {%><%=i%><%}%>:00:00"><%=i%>:00</option>
                            <option value="<%if (i < 10) {%>0<%=i%><%} else {%><%=i%><%}%>:30:00"><%=i%>:30</option>
                            <%
                                }
                            %>
                        </select>
                    </div>
                </div>
                <div class="row">
                    <div class="col s12">
                        <label for="exame-cadastro-custo" class="teal-text">Custo</label>
                        <input id="exame-cadastro-custo" name="custo" type="number" value="0" readonly>
                    </div>
                </div>
                <!-- Modal Trigger -->
                <button type="submit" class="waves-effect waves-light btn ">Agendar</button>

                <!-- Modal Structure -->
                <div id="modal1" class="modal">
                    <div class="modal-content">
                        <p>A disponibilidade de médicos e horários está sujeito a alterações</p>
                    </div>
                    <div class="modal-footer">
                        <input class="modal-close waves-effect btn-small" value="Concordo" type="submit">
                    </div>
                </div>
            </form>
        </div>
        <!--Consulta-->
        <div class="agendarC container">
            <form action="/expedicao/store" method="POST">
                <div class="row">
                    <div class="input-field col s12">
                        <label class="teal-text lighten-4" for="consulta-cadastro-tipo">Agendarei um</label>
                        <input id="consulta-cadastro-tipo" type="text" name="tipo" value="Consulta" readonly>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <%
                            if (usuario.isColaborador()) {
                                
                                if (cargoDoFuncionario.equals("Recepcionista")) {
                                    List<UsuarioBean> usuariosE = new UsuarioDAO().obterTodos();
                        %>
                        <select id="exame-cadastro-id-usuario" name="id-usuario" required="required">
                            <option value="" disabled selected>Agende aqui para</option>
                            <% for (int i = 0; i < usuariosE.size(); i++) {
                            %>
                            <option value="<%=usuariosE.get(i).getId()%>"><%=usuariosE.get(i).getNome()%></option>
                            <%
                                }
                            } else {
                            %>
                            <select id="exame-cadastro-id-usuario" name="id-usuario" required="required">
                                <option value="<%=usuario.getId()%>" selected ><%=usuario.getNome()%></option>
                            </select>
                            <%
                                }
                            %>
                        </select>
                        <%
                        } else {
                        %>
                        <select id="exame-cadastro-id-usuario" name="id-usuario" required="required">
                            <option value="<%=usuario.getId()%>" selected ><%=usuario.getNome()%></option>
                        </select>
                        <%
                            }
                        %>
                        <label for="consulta-cadastro-id-usuario" class="teal-text">Paciente</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <select id="consulta-cadastro-id-funcionario" name="id-funcionario" required="required">
                            <option value="" disabled selected>Ser atendido por</option>
                            <%
                                List<FuncionarioBean> funcionariosC = new FuncionarioDAO().obterTodos();
                                for (int i = 0; i < funcionariosC.size(); i++) {
                                    if (funcionariosC.get(i).getCargo().getNome().equals("Medico")) {
                            %>
                            <option value="<%=funcionariosC.get(i).getId()%>"><%=funcionariosC.get(i).getUsuario().getNome()%></option>
                            <%
                                    }
                                }
                            %>
                        </select>
                        <label for="consulta-cadastro-id-funcionario" class="teal-text">Médico</label>
                    </div>
                </div>
                <div class="row">
                    <div class="col s12">
                        <label class="teal-text teatl lighten-4" for="consulta-cadastro-nome">Escolha a especialide<span class="red-text">*</span></label>
                        <select id="consulta-cadastro-nome" name="nome" >
                            <option value="" disabled selected>Especialidade</option>
                            <option value="Clinico geral">Clínico geral</option>
                            <option value="Cardiologista">Cardiologista</option>
                            <option value="Endocrinologista">Endocrinologista</option>
                            <option value="Ginecologista">Ginecologista</option>
                            <option value="Oftalmologista">Oftalmologista</option>
                            <option value="Ortopedista">Ortopedista</option>
                            <option value="Otorrinolaringologista">Otorrinolaringologista</option>
                            <option value="Psiquiatra">Psiquiatra</option>
                        </select>
                    </div>
                </div>
                <div class="row">
                    <div class="col s5 left">
                        <label class="teal-text teatl lighten-4" for="consulta-cadastro-data">Qual a data de sua preferência?<span class="red-text">*</span></label>
                        <input id="consulta-cadastro-data" type="text" name="data" class="datepicker" required="required">
                    </div>
                    <div class="col s5 right">
                        <label for="consulta-cadastro-hora" class="teal-text">Horário</label>
                        <select id="consulta-cadastro-hora" name="hora" class="browser-default row" required="required">
                            <option value="" disabled selected>Escolha o horário desejado</option>
                            <% for (int i = 5; i <= 20; i++) {
                            %>
                            <option value="<%if (i < 10) {%>0<%=i%><%} else {%><%=i%><%}%>:00:00"><%=i%>:00</option>
                            <option value="<%if (i < 10) {%>0<%=i%><%} else {%><%=i%><%}%>:30:00"><%=i%>:30</option>
                            <%
                                }
                            %>
                        </select>
                    </div>
                </div>
                <div class="row">
                    <div class="col s12">
                        <label for="consulta-cadastro-custo" class="teal-text">Custo</label>
                        <input id="consulta-cadastro-custo" name="custo" type="number" value="0" readonly>
                    </div>
                </div>
                <!-- Modal Trigger -->
                <button type="submit" class="waves-effect waves-light btn">Agendar</button>

                <!-- Modal Structure -->
                <div id="modal2" class="modal">
                    <div class="modal-content">
                        <h4></h4>
                        <p>A disponibilidade de médicos e horários está sujeito a alterações </p>
                    </div>
                    <div class="modal-footer">
                        <input class="modal-close waves-effect btn-small" value="Concordo" type="submit">
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>