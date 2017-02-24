CREATE TABLE bird_description (
  ID              SERIAL PRIMARY KEY,
  NAME            VARCHAR(30) NOT NULL,
  TAXONOMY_ORDER  INT,
  TAXONOMY_FAMILY INT,
  TAXONOMY_GENUS  INT,
  SPECIES         VARCHAR(50)        NOT NULL,
  DESCRIPTION     VARCHAR(1000),
  PHOTO           VARCHAR(100),
  PREVIEW_PHOTO   VARCHAR(100),
  FLYING_PHOTO    VARCHAR(100)
);

INSERT INTO bird_description (NAME, TAXONOMY_ORDER, TAXONOMY_FAMILY, TAXONOMY_GENUS, SPECIES, DESCRIPTION)
VALUES ('Снегирь', 0, 0, 0, 'Pyrrhula pyrrhula',
        'Птица мелких размеров, чуть больше воробья. Голова сверху, вокруг клюва и глаз — чёрная. Маховые и рулевые перья тоже чёрные, с синим металлическим отливом. Поясница и подхвостье — белые. Спина, плечи и зашеек у самца серые. Щёки, шея снизу, брюхо и бока — красные. Тон и интенсивность окраски нижней стороны тела зависит от подвидовой принадлежности и индивидуальных особенностей. Зашеек и плечи самки серые. Спина буровато-коричневая. Щёки, шея снизу, живот и бока — серо-коричневые. Оперение птенцов преимущественно охристо-коричневого цвета. «Чёрной шапочки», как у взрослых особей, на голове у птенцов нет.');

INSERT INTO bird_description (NAME, TAXONOMY_ORDER, TAXONOMY_FAMILY, TAXONOMY_GENUS, SPECIES, DESCRIPTION)
    VALUES ('Домовый воробей', 0, 0, 0, 'Passer domesticus', 'Это одна из самых известных птиц, обитающих по соседству с жилищем человека (отсюда её видовое название «домовый») и хорошо узнаваемых как по внешнему виду, так и по характерному чириканью.');

INSERT INTO bird_description (NAME, TAXONOMY_ORDER, TAXONOMY_FAMILY, TAXONOMY_GENUS, SPECIES, DESCRIPTION)
    VALUES ('Белый аист', 0,0,0, 'Ciconia ciconia', 'Белый аист — самый известный из аистов. Это белая птица с чёрными концами крыльев, длинной шеей, длинным, тонким, красным клювом и длинными красноватыми ногами. Когда крылья у аиста сложены, создаётся впечатление, что вся задняя часть тела аиста чёрная. Отсюда его украинское название — черногуз. Самки по окрасу неотличимы от самцов, но несколько меньше.');