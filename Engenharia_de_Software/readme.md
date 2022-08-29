"We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth. Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming."

Titus Winters, Software Engineering at Google

De acordo com Titus Winters, os Engenheiros de Software, responsaveis por projetar e guiar o desenvolvimento de sistemas, além de cuidar da manutenção de um sistema, podem ser desenvolvedores, todavia, desenvolvedores não podem ser engenheiros de software. Visto que os Engenheiros de Software desenvolvem e mantém a plataforma, e os desenvolvedores constroem o programa contido na plataforma.


## Oficina

### Requisitos funcionais:
  - Cadastro dos diferentes tipos de máquinas existente na oficina, inserindo marca, modelo, número de série e o setor; 
  - Identificação da localidade da máquina, através da marca, modelo, número de série e setor;
  - Buscar uma máquina a partir de seu número de série;

### Casos de Uso
<div align="center">
<img src="https://user-images.githubusercontent.com/108765052/186031237-562f4b12-a85c-4d6a-84e4-3e03be6cc2d9.png" width="650px" />
</div>

### Requisitos não-funcionais:
  - Separação de Interesses: Implementar o modelo clássico Apresentação/Negócio/Repositório, o bem conhecido modelo em 3 camadas, onde cada pacote, projeto, assembly tem uma responsabilidade.
  - Portabilidade: executar o sistema em diferentes plataformas
  - Interface de simples acesso
  
### Diagrama de Classes UML
<div align="center">
<img src="https://user-images.githubusercontent.com/108765052/187309434-0eae16c1-5fcd-4ac7-9ad3-07b6d88b4b0e.jpg" width="1250px" />
</div>



