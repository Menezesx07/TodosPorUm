<template>
    <div class="modal fade" id="alunoCadastro" tabindex="-1" aria-labelledby="labelEstatico" aria-hidden="true" data-bs-backdrop="static" data-bs-keyboard="false">
                <div class="modal-dialog modal-dialog-centered modal-dialog-scrollable mx-auto">
                    <div class="modal-content">
                        <!-- Cabeçalho do Modal -->
                        <div class="modal-header">
                            <!-- Título -->
                            <h5 class="modal-title fw-bold" id="labelEstatico">CADASTRO DO ALUNO</h5> <!-- /fim Título -->
                            
                            <!-- Botão de fechar no canto superior -->
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            <!-- /fim Botão de fechar no canto superior -->
                        </div>  <!-- /fim Cabeçalho do Modal -->
                        
                        <!-- Corpo do Modal -->
                        <div class="modal-body">
                            
                            <p class="mb-4">
                                <small class="text-danger">*</small>
                                <span class="text-secondary">Preenchimento obrigatório</span>
                            </p>

                            <!-- Formulário de cadastro -->
                            <form action="">

                                <!-- Nome e Sobrenome do aluno -->
                                <div class="row cadastro-aluno coluna mb-3">
                                    <div class="col">
                                        <label for="idNome" class="form-label">Nome:</label>
                                        <small class="text-danger">*</small>

                                        <input type="text" class="form-control" id="idNome" required>
                                    </div>

                                    <div class="col">
                                        <label for="idSobrenome" class="form-label">Sobrenome:</label>
                                        <small class="text-danger">*</small>

                                        <input type="text" class="form-control" id="idSobrenome" required>
                                    </div>
                                </div>  <!-- /fim Nome e Sobrenome do aluno -->

                                <div class="row mb-4">
                                <!-- Data de nascimento -->
                                    <div class="col">
                                        <label for="idData">Data de nascimento:</label>
                                        <small class="text-danger">*</small>

                                        <input type="date" id="idData" class="form-control" required>
                                    </div>  <!-- /fim Data de Nascimento -->

                                    <div class="col">
                                        <p>
                                            Sexo:
                                            <small class="text-danger">*</small>
                                        </p>

                                        <div class="form-check form-check-inline">
                                            <input type="radio" class="form-check-input" name="sexo" id="idMasc" value="opt1">

                                            <label for="idDMasc" class="form-check-label">Masculino</label>
                                        </div>

                                        <div class="form-check form-check-inline">
                                            <input type="radio" class="form-check-input" name="sexo" id="idFem" value="opt2" checked>

                                            <label for="idFem" type="radio" class="form-check-label">Feminino</label>
                                        </div>
                                    </div>
                                </div>

                                <!-- Tipo sanguíneo -->
                                <div class="row coluna mb-4">
                                    <div class="col">
                                        <label for="idSangue">Tipo sanguíneo:</label>

                                        <select id="idSangue" class="form-select text-center">
                                            <option value="SemInfo" selected>-- Não sei --</option>

                                            <option value="Amais">A+</option>
                                            <option value="Amenos">A-</option>

                                            <option value="Bmais">B+</option>
                                            <option value="Bmenos">B-</option>

                                            <option value="ABmais">AB+</option>
                                            <option value="ABmenos">AB-</option>

                                            <option value="Omais">O+</option>
                                            <option value="Omenos">O-</option>
                                        </select>
                                    </div> <!-- /fim Tipo sanguíneo -->

                                    <!-- Deficiência(s) (Sim/Não) -->
                                    <div class="col ms-2">
                                        <p>
                                            Possui deficiência:
                                            <small class="text-danger">*</small>
                                        </p>
                                    
                                        <div class="form-check form-check-inline">
                                            <input type="radio" class="form-check-input" name="def" id="idDefSim" value="opt1">

                                            <label for="idDefSim" class="form-check-label">Sim</label>
                                        </div>

                                        <div class="form-check form-check-inline">
                                            <input type="radio" class="form-check-input" name="def" id="idDefNao" value="opt2" checked>

                                            <label for="idDefNao" type="radio" class="form-check-label">Não</label>
                                        </div>
                                    </div>  <!-- /fim Deficiências (Sim/Não) -->
                                </div>

                                <!-- Escolher deficiência(s) -->
                                <div class="mb-4">
                                    <p>Qual(s) deficiência(s):</p>

                                    <div class="d-flex">
                                        <!-- Deficiência físicas -->
                                        <div class="col">
                                            <p class="fw-bold">Física</p>

                                            <div class="form-check mb-1">
                                                <input class="form-check-input" type="checkbox" id="idCheckFis1">

                                                <label class="form-check-label" for="idCheckFis1">Auditiva</label>
                                            </div>

                                            <div class="form-check mb-1">
                                                <input class="form-check-input" type="checkbox" id="idCheckFis2">

                                                <label class="form-check-label" for="idCheckFis2">Visual</label>
                                            </div>

                                            <div class="form-check mb-1">
                                                <input class="form-check-input" type="checkbox" id="idCheckFis3">

                                                <label class="form-check-label" for="idCheckFis3">Paraplegia</label>
                                            </div>

                                            <div class="form-check mb-1">
                                                <input class="form-check-input" type="checkbox" id="idCheckFis4">

                                                <label class="form-check-label" for="idCheckFis4">Monoplegia</label>
                                            </div>

                                            <div class="form-check mb-1">
                                                <input class="form-check-input" type="checkbox" id="idCheckFis5">

                                                <label class="form-check-label" for="idCheckFis5">Tetraplegia</label>
                                            </div>

                                            <div class="form-check mb-1">
                                                <input class="form-check-input" type="checkbox" id="idCheckFis6">

                                                <label class="form-check-label" for="idCheckFis6">Hemiplegia</label>
                                            </div>

                                            <div class="form-check mb-1">
                                                <input class="form-check-input" type="checkbox" id="idCheckFis7">

                                                <label class="form-check-label" for="idCheckFis7">Ostomia</label>
                                            </div>

                                            <div class="form-check mb-1">
                                                <input class="form-check-input" type="checkbox" id="idCheckFis8">

                                                <label class="form-check-label" for="idCheckFis8">Paralisia cerebral</label>
                                            </div>
                                        </div> <!-- /fim Deficiências físicas -->
                                        
                                        <!-- Deficiências intelectuais -->
                                        <div class="col">
                                            <p class="fw-bold">Intelectual</p>

                                            <div class="form-check mb-1">
                                                <input class="form-check-input" type="checkbox" id="idCheckInt1">

                                                <label class="form-check-label" for="idCheckInt1">Autismo Leve</label>
                                            </div>

                                            <div class="form-check mb-1">
                                                <input class="form-check-input" type="checkbox" id="idCheckInt2">

                                                <label class="form-check-label" for="idCheckInt2">Autismo Moderado</label>
                                            </div>

                                            <div class="form-check mb-1">
                                                <input class="form-check-input" type="checkbox" id="idCheckInt3">

                                                <label class="form-check-label" for="idCheckInt3">Autismo Grave</label>
                                            </div>

                                            <div class="form-check mb-1">
                                                <input class="form-check-input" type="checkbox" id="idCheckInt4">

                                                <label class="form-check-label" for="idCheckInt4">Síndrome de Down</label>
                                            </div>
                                        </div> <!-- /fim Deficiências intelectuais -->
                                    </div>
                                </div> <!-- /fim Escolher deficiência(s) -->

                                <div class="row coluna">
                                    <div class="col">
                                        <p>
                                            Turma:
                                            <small class="text-danger">*</small>
                                        </p>

                                        <select class="form-select" required>
                                            <optgroup label="Turma A">
                                                <option value="ano1A">1º Ano - A</option>
                                                <option value="ano2A">2º Ano - A</option>
                                                <option value="ano3A">3º Ano - A</option>
                                                <option value="ano4A">4º Ano - A</option>
                                            </optgroup>

                                            <optgroup label="Turma B">
                                                <option value="ano1B">1º Ano - B</option>
                                                <option value="ano2B">2º Ano - B</option>
                                                <option value="ano3B">3º Ano - B</option>
                                                <option value="ano4B">4º Ano - B</option>
                                            </optgroup>
                                        </select>
                                    </div> <!-- /fim Turma do aluno -->

                                    <!-- Turno do aluno -->
                                    <div class="col ms-2">
                                        <p>
                                            Turno:
                                            <small class="text-danger">*</small>
                                        </p>

                                        <div class="form-check form-check-inline">
                                            <input type="radio" id="idManha" class="form-check-input" name="radioTurno" checked>
                                            <label for="idManha" class="form-check-label">Manhã</label>
                                        </div>

                                        <div class="form-check form-check-inline">
                                            <input type="radio" id="idTarde" class="form-check-input" name="radioTurno">
                                            <label for="idTarde" class="form-check-label">Tarde</label>
                                        </div>

                                        <div class="form-check form-check-inline">
                                            <input type="radio" id="idIntegral" class="form-check-input" name="radioTurno">
                                            <label for="idIntegral" class="form-check-label">Integral</label>
                                        </div>
                                    </div> <!-- /fim Turno do aluno -->
                                </div>
                            </form> <!-- /fim Formulário de cadastro -->
                        </div> <!-- /fim Corpo do Modal -->
                        
                        <!-- Rodapé do Modal -->
                        <div class="modal-footer">
                            
                            <!-- Botão de Enviar -->
                            <button type="button" class="btn btn-success fw-bold mx-auto w-75">
                                ENVIAR
                            </button> <!-- /fim Botão de Enviar -->
                        </div> <!-- /fim Rodapé do Modal -->
                    </div>
                </div>
            </div> <!-- /fim Modal -->
</template>


<script>
export default {
    name: "CadastroPai"
    
}
</script>

<style>

</style>