# CRUD de Clientes - Desafio Módulo 3

Este projeto é uma API REST desenvolvida como parte do **Desafio do Módulo 3** do curso **Java Spring Professional** do professor Nélio Alves. A aplicação foca-se no gerenciamento de clientes, implementando uma arquitetura em camadas e validações de dados.

## Funcionalidades
A API permite realizar as seguintes operações através do endpoint `/clients`:

* **Busca por ID**: Retorna um cliente específico.
* **Listagem Paginada**: Retorna todos os clientes com suporte a paginação.
* **Inserção**: Regista um novo cliente no sistema.
* **Atualização**: Modifica os dados de um cliente existente.
* **Remoção**: Elimina um cliente por ID.

* ## Estrutura do Modelo
A entidade **Client** e o seu respectivo **DTO** incluem os seguintes campos:
* **Nome**: Obrigatório (não pode ser vazio ou em branco).
* **CPF**: Identificação do cliente.
* **Renda**: Rendimento do cliente.
* **Data de Nascimento**: Validada para não permitir datas futuras.
* **Filhos**: Quantidade de filhos.
