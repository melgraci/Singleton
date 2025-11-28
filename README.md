Padrão Singleton:
O padrão Singleton é um padrão de projeto criacional que garante que uma classe só tenha uma única instância durante toda a execução do programa. Além disso, fornece um ponto de acesso global para essa instância, ou seja, qualquer parte do sistema pode usar o mesmo objeto único.​
  
Problemas que ele pode pode resolver:
Existem situações em sistemas onde precisamos que apenas uma instância de uma classe exista. Como:
Um gerenciador de configurações: para garantir que a configuração usada seja sempre a mesma em todo o sistema.
Um logger central: para registrar eventos sem duplicar arquivos ou perder informações.​
Acesso a um recurso compartilhado, como conexão a banco de dados ou fila de tarefas.

Se permitirmos várias instâncias, corremos risco de conflitos, informações incoerentes ou desperdício de recursos.

E como o Singleton resolve esse problema
O Singleton restringe a criação de instâncias usando um construtor privado e armazenando a instância única dentro da própria classe. 
Apenas um método público (geralmente chamado de getInstance ou similar) permite acessar ou criar a instância:

O construtor é privado, então você não pode instanciar direto (new).
Um atributo estático armazena a instância única.
Um método público retorna sempre essa mesma instância.
Em sistemas concorrentes, implementações avançadas usam mecanismos de proteção para garantir que a instância não seja criada duas vezes (thread-safety).

O diagrama mostra:



![Diagrama Singleton](Singleton.drawio.png)



- Atributo privado estático `instance` que armazena a única instância
- Construtor privado que impede criação direta
- Método público `getInstance()` que é o ponto global de acesso

