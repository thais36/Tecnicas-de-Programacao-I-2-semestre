CREATE DATABASE tb_login;

use tb_login;

CREATE TABLE IF NOT EXISTS `tb_login` (
  `id` int(11) NOT NULL,
  `user` varchar(50) NOT NULL,
  `name` varchar(150) NOT NULL,
  `password` varchar(25) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

ALTER TABLE `tb_login`
  ADD PRIMARY KEY (`id`);

INSERT INTO `tb_login` (`id`, `user`, `name`, `password`, `status`) VALUES
(1, 'cbenossi', 'Claudio Benossi', 'Aluno123456', 1),
(2, 'teste', 'Fulano de Tal', '123456', 1);