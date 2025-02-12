## Projeto de Biblioteca de Jogos (DSlist) com Spring

O projeto "Biblioteca de Jogos" foi desenvolvido durante um intensivo de 5 dias de formação em Java Spring. No treinamento foi analisado variós tópicos essenciais para o desenvolvimento de aplicações back-end. Os principais pontos abordados incluem:

**- Estruturação de Projeto Spring Rest:**

Definição de uma estrutura clara e organizada para projetos Spring Rest, facilitando a manutenção e a escalabilidade do código.

**- Entidades e ORM (Object-Relational Mapping):**

Criação de entidades que representam os dados do jogo e mapeamento dessas entidades para tabelas de banco de dados usando ORM.

**- Database Seeding:**

Processo de pre-população do banco de dados com dados iniciais necessários para a operação da aplicação.

**- Padrão de Camadas:**

Implementação de um padrão de camadas (Controller, Service, Repository) para separar responsabilidades e melhorar a modularidade do sistema.

**- Padrão DTO (Data Transfer Object):**

Utilização de DTOs para transferir dados entre as camadas da aplicação, garantindo segurança e eficiência.

**- Relacionamentos N-N e Classe de Associação:**

Modelagem de relacionamentos muitos-para-muitos entre entidades de forma eficaz, utilizando classes de associação e EmbeddedID.

**- Consultas SQL no Spring Data JPA:**

Criação e execução de consultas SQL utilizando a API do Spring Data JPA, permitindo operações complexas e personalizadas.

**- Projeções:**

Utilização de projeções para otimizar a recuperação de dados do banco de dados, selecionando apenas os campos necessários.

**- Ambiente Local com Docker Compose:**

Configuração de um ambiente local de desenvolvimento utilizando Docker Compose, simplificando a instalação e configuração de dependências.

**- Processo de Homologação Local e Deploy com CI/CD:**

Definição de processos de homologação local e deploy contínuo (CI/CD), garantindo que novas versões do sistema sejam entregues de forma confiável e automatizada.

**- Configuração de CORS:**

Implementação de configurações de CORS (Cross-Origin Resource Sharing) para permitir que a aplicação seja acessada de diferentes origens.

**- Design e Implementação de Endpoint Especial:**

Criação de endpoints específicos para funcionalidades especiais, como operações de atualização e manipulação de listas na parte de posicionamento.

![image](https://github.com/user-attachments/assets/53366870-a86b-4ccd-9de2-00c45a8103d6)

### Diagrama UML

- Game e GameList são tabelas principais.
- Belonging funciona como uma tabela de junção, armazenando a relação entre jogos e listas.
- BelongingPK serve como chave primária composta, combinando game_id e list_id.
- position representa a posição do jogo na lista.
