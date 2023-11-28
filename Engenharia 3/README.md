<table>
    <tr>
        <td>Nome do padrão</td>
        <td>Anti-padrão</td>
        <td>Definição do padrão</td>
        <td>Problema que ele resolve</td>
        <td>Onde é utilizado na arquitetura Java</td>
    </tr>
    <tr>
        <td>Composite </td>
        <td>Complexidade para manutenção e dificuldade em caso estrutura muito complexa</td>
        <td>O padrão Composite é um padrão de design estrutural que permite que você trate objetos individuais e composições de objetos de maneira uniforme. Ele combina objetos em estruturas de árvore para representar hierarquias parte-todo.</td>
        <td>O Composite evita código repetitivo, tratando objetos e composições de maneira uniforme. Usa recursão para resolver problemas dividindo-os em partes menores, simplificando o código e tornando o sistema mais modular.</td>
        <td>Em Java, o padrão Composite organiza componentes em estruturas como documentos ou interfaces. É útil para construir hierarquias flexíveis e modulares, como em árvores de categorias.</td>
    </tr>
   </tr>
    <tr>
        <td>Strategy</td>
        <td>Herança</td>
        <td>Envolve agrupar uma variedade de algoritmos por meio de composição, tornando-os intercambiáveis por meio de polimorfismo.</td>
        <td>Encapsulamento.</td>
        <td>É empregado em Java para gerenciar estratégias de direcionamento de rede, escolha de algoritmos de criptografia, definição de políticas de autenticação, entre outras aplicações.</td>
    </tr>
 </tr>
    <tr>
        <td>Observer </td>
        <td>Alto Acomplamento</td>
        <td>Notifica imediatamente mesmo que os objetos estejam separados contanto que estejam no mesmo método.</td>
        <td>Facilita que objetos se inscrevam para receber alertas imediatos sobre eventos em um objeto monitorado, promovendo a comunicação entre eles.</td>
        <td>Oo padrão Observer é empregado para automatizar a atualização em tempo real de interfaces de usuário, notificar assinantes de eventos em sistemas de mensagens e manter a consistência de dados distribuídos. Ele oferece uma maneira desacoplada de reagir a eventos em outros objetos, exemplificado pela biblioteca Observable e implementações de EventListener em componentes Swing.</td>
    </tr>

 </tr>
    <tr>
        <td>Singleton</td>
        <td>Múltiplas instâncias</td>
        <td>Garante que uma classe tenha apenas uma instância, utilizando um ponto global de acesso no uso do código.</td>
        <td>Simplifica o código, não usando multiplas instâncias e sim apenas uma por sistema.</td>
        <td>Utilizado para unificar e gerenciar os recursos em apenas um ponto global.</td>
    </tr>

</tr>
    <tr>
        <td>Facade</td>
        <td>Alta complexidade</td>
        <td>Simplifica o sistema em uma eventual manutenção, evitando o alto acoplamento, deixando sistemas complexos mais simples de serem utilizados.</td>
        <td>Evita que seja criado sistemas complexos com alta dificuldade de manutenção e entendimento do que está sendo feito, simplificando as operações.</td>
        <td>Utilizado em Java para gerenciar sistemas com manutenções constantes, e evitando o acoplamento em sistemas de alta complexidade como grandes bancos de dados..</td>
    </tr>
 
</table>
