| Padrão | Anti-padrâo | Descrição | Problema que resolve |
| -------- | -------- | -------- |------------ |
| Strategy | Herança | Encapsula uma familia de algoritmos e os torna intercambiaveis usando polimorfismo | Duplicação de código |
| Observer | Acoplamento | Define uma dependência um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente | Evita o acoplamento rígido entre os objetos |
| Composite | Tratamento diversificado de classes | Permite a criação de estruturas de objetos em forma de árvore, em que os objetos individuais e as composições deles são tratados de forma uniforme |  Tratar objetos individuais e grupos de objetos de maneira uniforme |
| Singleton | Muitas instâncias de uma única classe | Garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global para essa instância |  Recursos compartilhados que devem ser acessados de forma consistente por várias partes do código |
| Facade | Sobrecarga de responsabilidades na classe fachada | Fornece uma interface simplificada para um conjunto complexo de subsistemas, tornando mais fácil de usar e reduzindo a dependência entre os clientes e os subsistemas | Complexidade entre os subsistemas e os clientes (muitas classes) |
