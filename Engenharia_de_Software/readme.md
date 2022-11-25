"We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth. Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming."

Titus Winters, Software Engineering at Google

De acordo com Titus Winters, os Engenheiros de Software, responsaveis por projetar e guiar o desenvolvimento de sistemas, além de cuidar da manutenção de um sistema, podem ser desenvolvedores, todavia, desenvolvedores não podem ser engenheiros de software. Visto que os Engenheiros de Software desenvolvem e mantém a plataforma, e os desenvolvedores constroem o programa contido na plataforma.

# Ciclo de Vida do Desenvolvimento de Software

## Requisitos

### Funcionais
  - Cadastro de setores;
  - Cadastro dos tipos de máquinas da oficina: marca, modelo, número de série e o setor; 
  - Identificação da localidade da máquina: através da marca, modelo, número de série e setor;
  - Identificação da localidade do setor: através da nome.
  
### User Stories
<div align="center">
<img src="https://user-images.githubusercontent.com/108765052/203986895-7488881b-d5e8-424c-93a4-3f31002958c4.jpeg" width="650px" />
</div>

### Casos de Uso
<div align="center">
<img src="https://user-images.githubusercontent.com/108765052/203987352-df604e40-a1f7-44b5-a61c-a17d0b5fa679.jpeg" width="1250px" />
</div>

### Diagrama de sequência
<div align="center">
<img src="https://user-images.githubusercontent.com/108765052/203987153-7d42d647-bcc2-45a9-ab9d-07f3274b2926.jpeg" width="1250px" />
</div>

### Não-funcionais:
  - Separação de Interesses: Implementar o modelo clássico Apresentação/Negócio/Repositório, o bem conhecido modelo em 3 camadas, onde cada pacote, projeto, assembly tem uma responsabilidade;
  - Acesso em diferentes plataformas;

### Diagrama de Classes UML
<div align="center">
<img src="https://user-images.githubusercontent.com/108765052/203987038-acec4441-ceb1-450a-b2c4-32f18a6dc6f3.jpeg" width="1250px" />
</div>

### Códigos
### Oficina
<div align="center">
<img src="https://user-images.githubusercontent.com/108765052/203988358-060f1d0b-3da2-4035-bdbd-0caf5162d022.jpeg" width="1250px" />
</div>

### Máquina
<div align="center">
<img src="https://user-images.githubusercontent.com/108765052/203988440-1781c96d-58c3-42d0-a062-9172204965b2.jpeg" width="1250px" />
</div>

### Setor
<div align="center">
<img src="https://user-images.githubusercontent.com/108765052/203988497-a825ed20-a590-4b4a-8d8e-889a4fc76ccf.jpeg" width="1250px" />
</div>

### Especificação
<div align="center">
<img src="https://user-images.githubusercontent.com/108765052/203988577-fa9ad312-6556-46ef-8523-0f7fabb2d663.jpeg" width="1250px" />
</div>


