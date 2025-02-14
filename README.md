istema de Gestão de Estoque de Produtos
Descrição:
Este sistema permite o cadastro e exibição de produtos, juntamente com a gestão de suas quantidades mínima e máxima de estoque. O sistema também calcula o estoque médio de cada produto com base nas quantidades fornecidas e permite limpar a lista de produtos cadastrados.

Funcionalidades:
Cadastrar Produtos:

Permite cadastrar um produto, fornecendo seu nome, quantidade máxima e mínima no estoque.
O estoque médio é calculado automaticamente.
Exibir Produtos:

Exibe todos os produtos cadastrados com seus respectivos nomes e estoques médios.
Limpar Lista:

Limpa todos os produtos cadastrados na lista.
Sair:

Encerra o sistema.
Estrutura do Sistema:
Classe MediaEstoque:

Representa um produto com nome, quantidade mínima, quantidade máxima e estoque médio.
Métodos:
setNome(String nome): Define o nome do produto.
setQuantiMinima(int minima): Define a quantidade mínima do estoque, com validação.
setQuantiMaxima(int maxima): Define a quantidade máxima do estoque, com validação.
calculaEstoque(): Calcula o estoque médio com base na quantidade mínima e máxima.
info(): Exibe o estoque médio.
exibirProdutos(): Exibe o nome e o estoque médio do produto.
Classe Principal:

Interage com o usuário por meio de um menu.
Permite adicionar produtos, visualizar a lista de produtos cadastrados, limpar a lista e sair do sistema.
Exemplo de Execução:
O usuário escolhe a opção para cadastrar um produto.
O sistema solicita o nome do produto, quantidade máxima e mínima do estoque.
O estoque médio é calculado e o produto é adicionado à lista.
O usuário pode exibir os produtos cadastrados ou limpar a lista.
Dependências:
Scanner para captura de entradas do usuário.
ArrayList para armazenar os produtos cadastrados.
