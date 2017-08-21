# hibernate-mysql-OneToManyMapping
A Simple Hibernate MySQL example explaining the OneToMany and ManyToOne relationships

@OneToMany - is defined in the owner class on the child entity declaration

@ManyToOne - is defined in the child class on the owner entity to inform that the child can have multiple records associated to the primary id of one owner. This declaration is important to obtain a reverse relationship between the child and the parent entity.

For example - Address(Child) and Employee(Parent)

You can persist the Employee via Address and also by pulling up Address object you can get information about the Employee also 

