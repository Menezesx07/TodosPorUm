<template>

<!-- Modal -->
<div class="modal fade" id="formModal" tabindex="-1" aria-labelledby="labelEstatico" aria-hidden="true" data-bs-backdrop="static" data-bs-keyboard="false">
            <div class="modal-dialog modal-dialog-centered modal-dialog-scrollable">
                  <div class="modal-content mx-auto">

           <!-- Cabeçalho do Modal -->
            <div class="modal-header">

           <!-- Título -->
           <h5 class="modal-title fw-bold" id="labelEstatico">CADASTRO</h5>
           <!-- /fim Título -->
                                
           <!-- Botão de fechar no canto superior -->
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
<!-- /fim Botão de fechar no canto superior -->
</div><!-- /fim Cabeçalho do Modal -->

<!-- Corpo do Modal -->
<div class="modal-body">
                                
        <p class="mb-4 text-start">
        <small class="text-danger">* </small>
        <span class="text-secondary">Preenchimento obrigatório</span>
        </p>

                <!-- Formulário de cadastro -->
                <form action="">

            <!-- Nome completo do aluno -->
            <div class="tamanho-input-modal mb-3">
                <label for="idNome" class="form-label">Nome Completo:</label>
                <small class="text-danger">*</small>

                <input type="text" class="form-control" name="usrNome" id="idNome" required>
            </div> <!-- /fim Nome do aluno -->

            <!-- Data de nascimento -->
            <div class="mb-3">
                <label for="idData" class="form-label">Data de nascimento:</label>
                <small class="text-danger">*</small>

                <input type="date" id="idData" class="form-control tamanho-input-modal" required>
            </div> <!-- /fim Data de Nascimento -->

            <!-- E-mail -->
            <div class="mb-3">
                <label for="idEmail" class="form-label">E-mail:</label>
                <small class="text-danger"> *</small>

                <input id="idEmail" class="form-control tamanho-input-modal" type="email" aria-describedby="emailHelp" required>

                <small class="text-secondary">Não compartilharemos seu e-mail com ninguém.</small>
            </div>  <!-- /fim E-mail -->

            <!-- Senha -->
            <div class="row coluna mb-3">
                <div class="col">
                    <label for="idSenha" class="form-label">Senha:</label>
                    <small class="text-danger">*</small>

                    <input type="password" class="form-control" id="idSenha" minlength="8">
                </div>

                <div class="col">
                    <label for="idConfSenha" class="form-label">Confirmar senha:</label>
                    <small class="text-danger">*</small>

                    <input type="password" class="form-control" id="idConfSenha">
                </div>
            </div>  <!-- /fim Senha -->

            <!-- Contato -->
            <div class="row coluna mb-3">
                <div class="col">
                    <label for="idTel">Telefone:</label>

                    <div class="input-group">
                        <span class="input-group-text" id="basic-addon">+55</span>

                        <input type="tel" id="idTel" class="form-control" aria-label="usrTelefone" aria-describedby="basic-addon">
                    </div>
                </div>

                <div class="col">
                    <label for="idCel">Celular:</label>
                    <small class="text-danger">*</small>

                    <input type="tel" id="idCel" class="form-control"  required>
                </div>
            </div>  <!-- /fim Contato -->

            <!-- Localização -->
            <div class="row coluna">

                <p>
                    Localização:
                    <small class="text-danger">*</small>
                </p>

                <div class="col"> <!-- CEP -->
                    <label for="idCEP" class="form-label text-start">CEP:</label>

                    <input type="number" id="idCEP" class="form-control" min="0" required>
                </div>

                <div class="col">  <!-- Cidade -->
                    <label for="idCid" class="form-label text-right">Cidade:</label>

                    <input type="text" id="idCid" class="form-control" placeholder="EX.: São Paulo" required>
                </div>

                <div class="col"> <!-- Estado -->
                    <label for="idEstado" class="text-right">Estado:</label>
                    
                    <select id="idEstado" class="form-select" required>
                        <optgroup label="Norte">
                            <option value="AC">Acre</option>
                            <option value="AP">Amapá</option>
                            <option value="AM">Amazonas</option>
                            <option value="PA">Pará</option>
                            <option value="RO">Rondônia</option>
                            <option value="RR">Roraima</option>
                            <option value="TO">Tocantins</option>
                        </optgroup>

                        <optgroup label="Nordeste">
                            <option value="AL">Alagoas</option>
                            <option value="BA">Bahia</option>
                            <option value="CE">Ceará</option>
                            <option value="MA">Maranhão</option>
                            <option value="PA">Paraíba</option>
                            <option value="PE">Pernambuco</option>
                            <option value="PI">Piauí</option>
                            <option value="RN">Rio Grande do Norte</option>
                            <option value="SE">Sergipe</option>
                        </optgroup>

                        <optgroup label="Centro-Oeste">
                            <option value="DF">Distrito Federal</option>
                            <option value="GO">Goiás</option>
                            <option value="MT">Mato Grosso</option>
                            <option value="MS">Mato Grosso do Sul</option>
                        </optgroup>

                        <optgroup label="Sudeste">
                            <option value="ES">Espírito Santo</option>
                            <option value="MG">Minas Gerais</option>
                            <option value="RJ">Rio de Janeiro</option>
                            <option value="SP" selected>São Paulo</option>
                        </optgroup>

                        <optgroup label="Sul">
                            <option value="PR">Paraná</option>
                            <option value="SC">Santa Catarina</option>
                            <option value="RS">Rio Grande do Sul</option>
                        </optgroup>
                    </select>
                </div> <!-- /fim Estado -->
            </div>  <!-- /fim Localização -->
            </form>  <!-- /fim Formulário de cadastro -->
        </div>  <!-- /fim Corpo do Modal -->

        <!-- Rodapé do Modal -->
        <div class="modal-footer">
                                <!-- Botão de Enviar -->
                                <button type="button" class="btn btn-success fw-bold mx-auto">
                                    ENVIAR
                                </button>  <!-- /fim Botão de Enviar -->
                            </div>  <!-- /fim Rodapé do Modal -->
                        </div>
                    </div>
                </div>  <!-- /fim Modal -->

</template>

<script>

    export default {
        name: "Cadastro"
    }

</script>

