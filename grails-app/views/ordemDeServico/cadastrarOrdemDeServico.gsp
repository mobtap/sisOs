<!DOCTYPE html>
<html lang="pt-br">
<head>
<title>Cadastro de OS</title>
<meta name="layout" content="public2" />
<meta content="width=device-width, initial-scale=1" name="viewport">
</head>
<body>
<p id="alertVerificador" class="text-red"></p>
	<section class="content-header" style="margin-left: 5%; margin-bottom:auto;">
		<h1>
			Ordem De Serviço <small>Cadastro</small>
		</h1>

		<ul class="nav nav-tabs"> 
		<div style= "text-align:right;"><a href="/sisOs/usuariosOs/login.gsp">Acesso</a></div></ul> 
	</section>
	<!-- CORPO DA PÁGINA -->
	<section class="content">
		<div>
			<g:if test="${ok}">
				<div class="alert alert-success">
					${ok}
				</div>
			</g:if>
			<g:if test="${erro}">
				<div class="alert alert-danger">
					${erro}
				</div>
			</g:if>
			<div style="margin-left: 150px">

				<g:form name="ordemDeServico" controller="ordemDeServico" action="salvarOrdemDeServico" class="form-horizontal">
					<fieldset>
					   <div class="alert alert-info"><strong>Aviso. </strong> A SETIC informa que o SisOS é de uso exclusivo para a abertura 
						  de suporte técnico do setor  de Tecnologia da Informação da Administração Municipal.
						</div>
						<div class="form-group">
							<label for="interessado" class="col-sm-2 control-label">Interessado</label>
							<div class="col-sm-4">

								<input class="form-control" placeholder="Interessado" id="interessado" required name="interessado" type="text" value="">
							</div>
						</div>
						<br>
						<script src="/sisOs/js/validarMatricula.js"></script>
						<div class="form-group">
							<label for="matricula" class="col-sm-2 control-label">Matricula</label>
							<div class="col-sm-4">

								<input class="form-control" id="matricula" placeholder="Matricula do interessado" required name="matricula" type="text" value="" onblur="validarMatricula();" >
							</div>
						</div>
						
						<br>
						<div class="form-group">
							<label for="telefone" class="col-sm-2 control-label">Telefone</label>
							<div class="col-sm-4">
								<g:textField class="form-control" placeholder="Telefone"
									name="telefone" value="" />
							</div>
						</div>
						<br>

						<script src="/sisOs/js/validaEmail.js"></script>
						<div class="form-group">
							<label for="email" class="col-sm-2 control-label">E-mail</label>
							<div class="col-sm-4">
								<g:textField type="email" class="form-control"
									placeholder="E-mail" id="email" name="email" value="" required="true"
									name="email" onblur="validaEMAIL(email)" />
							</div>
						</div>
						<br>

						<div class="form-group">
							<label for="orgao" class="col-sm-2 control-label">Orgão</label>
							<div class="col-sm-6">
								<select name="orgao" id="comboorgao"
									class="form-control selectpicker" data-size="5"
									data-live-search="true" onclick="habilitaCampo();">
									<g:each in="${orgao}">
										<option value="${it.id}">
											${it.nome}
										</option>
									</g:each>
								</select>
							</div>
						</div>
						<br>
						<div class="form-group">
							<label for="problema" class="col-sm-2 control-label">Problema</label>
							<div class="col-sm-4">
								<textarea rows="4" cols="5" class="form-control"
									placeholder="Descreva o Problema" name="problema" required></textarea>
							</div>
						</div>
					</fieldset>
					<div style="margin: 0 17% auto">
						<button type="submit" class="btn btn-primary btn-flat">
							</i>Salvar
						</button>
						<ul style="display: inline-block; margin-left: -30px">
							<li class="btn btn-default btn-flat"><a
								href="/sisOs/ordemDeServico/cadastrarOrdemDeServico/">Cancelar</a></li>
						</ul>
					</div>
				</g:form>
			</div>
		</div>
	</section>
</body>
</html>