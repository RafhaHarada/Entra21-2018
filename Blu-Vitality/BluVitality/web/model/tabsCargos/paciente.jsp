<%-- 
    Document   : paciente
    Created on : 20/09/2018, 08:51:14
    Author     : Luana Patricia Duarte (luanapatricia.blu@hotmail.com)
--%>
<%@page import="br.com.Sistema.DAO.UsuarioDAO"%>
<%@page import="br.com.Sistema.Bean.UsuarioBean"%>
<%
    UsuarioBean paciente = new UsuarioBean();

    int id_paciente = Integer.parseInt(request.getParameter("id"));
    paciente = new UsuarioDAO().obterPeloId(id_paciente);

%>
<div id="Funcionarios10" class="col s12 container">
 <ul class="collection col s6">
        <li class="collection-item avatar teal lighten-4">
            <img src="" alt="" class="circle red">
            <span class="nome">Nome:</span>
            <span><%=paciente.getNome()%></span>
        </li>
        <li class="collection-item teal lighten-5">
            <span class="data-nascimento">Data de nascimento:</span>
            <span>
                <% String dataEn[] = paciente.getData_nascimento().toString().split("-");
                    String dataBr = dataEn[2] + "/" + dataEn[1] + "/" + dataEn[0];
                %>
                <%=dataBr%>
            </span>
        </li>
        <li class="collection-item teal lighten-4">
            <span class="cpf">CPF:</span>
            <span><%=paciente.getCpf()%></span>
        </li>
        <li class="collection-item teal lighten-5">
            <span class="rg">RG:</span>
            <span><%=paciente.getRg()%></span>
        </li>
        <li class="collection-item teal lighten-4">
            <span class="naturalidade">Naturalidade:</span>
            <span><%=paciente.getNaturalidade()%></span>
        </li>
        <li class="collection-item teal lighten-5">
            <span class="sexo">Sexo:</span>
            <span><%=paciente.getSexo()%></span>
        </li>
        <li class="collection-item teal lighten-4">
            <span class="sanguineo">Tipo Sanguíneo:</span>
            <span><%=paciente.getTipo_sanguineo()%></span>
        </li>
    </ul>
    <ul class="collection col s6">
        <li class="collection-item teal lighten-4">
            <span class="cidade">Cidade:</span>
            <span><%=paciente.getCidade()%></span>
            <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
        </li>
        <li class="collection-item teal lighten-5">
            <span class="uf">UF:</span>
            <span><%=paciente.getUf()%></span>
            <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
        </li>
        <li class="collection-item teal lighten-4">
            <span class="endereco">Endereço</span>
            <span><%=paciente.getEndereco()%></span>
            <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
        </li>
        <li class="collection-item teal lighten-5">
            <span class="email">Email:</span>
            <span><%=paciente.getEmail()%></span>
            <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
        </li>
        <li class="collection-item teal lighten-4">
            <span class="telefone">Telefone:</span>
            <span><%=paciente.getTelefone()%></span>
            <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
        </li>
        <li class="collection-item teal lighten-5">
            <span class="contato-emergencia">Contato de emergência:</span>
            <span><%=paciente.getContato_emergencia()%></span>
            <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
        </li>
        <li class="collection-item teal lighten-4">
            <span class="estado-civil">Estado Civil:</span>
            <span><%=paciente.getEstado_civil()%></span>
            <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
        </li>
        <li class="collection-item teal lighten-5">
            <span class="convenio">Covenio:</span>
            <span><%=paciente.%></span>
            <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
        </li>
    </ul>
</div>
