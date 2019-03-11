package com.rolepoint.contacts;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    private static final String jsonContacts = "[\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Sibelius\"\n" +
            "    ],\n" +
            "    \"company\": \"Mattis Corporation\",\n" +
            "    \"email\": \"vehicula@et.com\",\n" +
            "    \"city\": \"Westerlo\",\n" +
            "    \"name\": \"David Harrington\",\n" +
            "    \"country\": \"Spain\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Chami\"\n" +
            "    ],\n" +
            "    \"company\": \"Vitae Erat LLC\",\n" +
            "    \"email\": \"non.arcu@dui.com\",\n" +
            "    \"city\": \"Osgoode\",\n" +
            "    \"name\": \"Madeson Hopkins\",\n" +
            "    \"country\": \"Tokelau\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"\"\n" +
            "    ],\n" +
            "    \"company\": \"Lacus Cras Associates\",\n" +
            "    \"email\": \"tempus.non.lacinia@ultricesposuerecubilia.com\",\n" +
            "    \"city\": \"Gelbressee\",\n" +
            "    \"name\": \"Nero Acosta\",\n" +
            "    \"country\": \"Panama\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"\"\n" +
            "    ],\n" +
            "    \"company\": \"Eu Euismod Ac Corp.\",\n" +
            "    \"email\": \"scelerisque.scelerisque.dui@Nullamvitaediam.org\",\n" +
            "    \"city\": \"Westmount\",\n" +
            "    \"name\": \"Ferris Yates\",\n" +
            "    \"country\": \"Peru\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Finale\",\n" +
            "      \"Cakewalk\"\n" +
            "    ],\n" +
            "    \"company\": \"Diam Sed Industries\",\n" +
            "    \"email\": \"dolor.Fusce@consectetueradipiscingelit.net\",\n" +
            "    \"city\": \"Cache Creek\",\n" +
            "    \"name\": \"Germaine Griffin\",\n" +
            "    \"country\": \"Oman\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Cakewalk\",\n" +
            "      \"Microsoft\"\n" +
            "    ],\n" +
            "    \"company\": \"Et Malesuada Fames Incorporated\",\n" +
            "    \"email\": \"congue@quis.net\",\n" +
            "    \"city\": \"Baunatal\",\n" +
            "    \"name\": \"Garrison Wolf\",\n" +
            "    \"country\": \"Uganda\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Apple Systems\"\n" +
            "    ],\n" +
            "    \"company\": \"Elit Fermentum Associates\",\n" +
            "    \"email\": \"at@Pellentesqueut.org\",\n" +
            "    \"city\": \"Kidderminster\",\n" +
            "    \"name\": \"Gwendolyn Delacruz\",\n" +
            "    \"country\": \"Kenya\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"\"\n" +
            "    ],\n" +
            "    \"company\": \"Pharetra Inc.\",\n" +
            "    \"email\": \"ullamcorper.velit.in@ante.co.uk\",\n" +
            "    \"city\": \"Pugwash\",\n" +
            "    \"name\": \"Debra Whitney\",\n" +
            "    \"country\": \"Monaco\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Lycos\",\n" +
            "      \"Apple Systems\",\n" +
            "      \"Lavasoft\"\n" +
            "    ],\n" +
            "    \"company\": \"Volutpat Incorporated\",\n" +
            "    \"email\": \"Duis@interdumNunc.org\",\n" +
            "    \"city\": \"Stockton-on-Tees\",\n" +
            "    \"name\": \"Hiram Osborne\",\n" +
            "    \"country\": \"Japan\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Cakewalk\"\n" +
            "    ],\n" +
            "    \"company\": \"Eget Odio Aliquam Company\",\n" +
            "    \"email\": \"tempor@ultricesposuerecubilia.org\",\n" +
            "    \"city\": \"Francavilla Fontana\",\n" +
            "    \"name\": \"Audra Stanley\",\n" +
            "    \"country\": \"Belgium\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Apple Systems\",\n" +
            "      \"Sibelius\",\n" +
            "      \"Microsoft\"\n" +
            "    ],\n" +
            "    \"company\": \"Ligula Foundation\",\n" +
            "    \"email\": \"sagittis@Mauris.com\",\n" +
            "    \"city\": \"Hexham\",\n" +
            "    \"name\": \"Ezekiel Keith\",\n" +
            "    \"country\": \"Samoa\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Cakewalk\",\n" +
            "      \"Macromedia\"\n" +
            "    ],\n" +
            "    \"company\": \"Eros Industries\",\n" +
            "    \"email\": \"rhoncus.Donec.est@dictumPhasellus.com\",\n" +
            "    \"city\": \"Zerba\",\n" +
            "    \"name\": \"Nicole Fry\",\n" +
            "    \"country\": \"India\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"\"\n" +
            "    ],\n" +
            "    \"company\": \"Sem Egestas Consulting\",\n" +
            "    \"email\": \"posuere.vulputate@Donecsollicitudinadipiscing.edu\",\n" +
            "    \"city\": \"Eugene\",\n" +
            "    \"name\": \"Alan Keller\",\n" +
            "    \"country\": \"Taiwan\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Lycos\",\n" +
            "      \"Adobe\"\n" +
            "    ],\n" +
            "    \"company\": \"Sem Institute\",\n" +
            "    \"email\": \"Ut.tincidunt.vehicula@mollisnoncursus.edu\",\n" +
            "    \"city\": \"Orciano Pisano\",\n" +
            "    \"name\": \"Ulla Winters\",\n" +
            "    \"country\": \"Latvia\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Finale\"\n" +
            "    ],\n" +
            "    \"company\": \"Varius Orci In Industries\",\n" +
            "    \"email\": \"neque.In.ornare@Proin.edu\",\n" +
            "    \"city\": \"Columbia\",\n" +
            "    \"name\": \"Rebekah Huff\",\n" +
            "    \"country\": \"Cameroon\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Sibelius\"\n" +
            "    ],\n" +
            "    \"company\": \"Eu Arcu Morbi Corp.\",\n" +
            "    \"email\": \"ligula.tortor@ametlorem.co.uk\",\n" +
            "    \"city\": \"Crotta d'Adda\",\n" +
            "    \"name\": \"Genevieve Franks\",\n" +
            "    \"country\": \"Czech Republic\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Apple Systems\",\n" +
            "      \"Chami\",\n" +
            "      \"Finale\"\n" +
            "    ],\n" +
            "    \"company\": \"Porttitor Scelerisque Neque Company\",\n" +
            "    \"email\": \"mollis@acliberonec.edu\",\n" +
            "    \"city\": \"Grande Prairie\",\n" +
            "    \"name\": \"Cleo Sanford\",\n" +
            "    \"country\": \"Comoros\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Chami\",\n" +
            "      \"Microsoft\",\n" +
            "      \"Yahoo\"\n" +
            "    ],\n" +
            "    \"company\": \"Molestie Tellus Consulting\",\n" +
            "    \"email\": \"eu.tellus@musProinvel.edu\",\n" +
            "    \"city\": \"Gijón\",\n" +
            "    \"name\": \"Amy Acosta\",\n" +
            "    \"country\": \"Egypt\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"\"\n" +
            "    ],\n" +
            "    \"company\": \"Ultrices PC\",\n" +
            "    \"email\": \"amet@massaVestibulumaccumsan.edu\",\n" +
            "    \"city\": \"Nil-Saint-Vincent-Saint-Martin\",\n" +
            "    \"name\": \"Kelsey Waters\",\n" +
            "    \"country\": \"Romania\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Adobe\"\n" +
            "    ],\n" +
            "    \"company\": \"Vel Incorporated\",\n" +
            "    \"email\": \"quis.accumsan.convallis@infelis.co.uk\",\n" +
            "    \"city\": \"Lleida\",\n" +
            "    \"name\": \"Bernard Kim\",\n" +
            "    \"country\": \"Holy See (Vatican City State)\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"\"\n" +
            "    ],\n" +
            "    \"company\": \"Faucibus Ut PC\",\n" +
            "    \"email\": \"magna@sed.com\",\n" +
            "    \"city\": \"Zele\",\n" +
            "    \"name\": \"Chadwick Howard\",\n" +
            "    \"country\": \"Tuvalu\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Chami\",\n" +
            "      \"Microsoft\"\n" +
            "    ],\n" +
            "    \"company\": \"Eget Volutpat Associates\",\n" +
            "    \"email\": \"diam@augue.co.uk\",\n" +
            "    \"city\": \"Kitscoty\",\n" +
            "    \"name\": \"Giselle Kidd\",\n" +
            "    \"country\": \"Estonia\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"\"\n" +
            "    ],\n" +
            "    \"company\": \"Vitae Sodales LLP\",\n" +
            "    \"email\": \"eu@velit.ca\",\n" +
            "    \"city\": \"Desteldonk\",\n" +
            "    \"name\": \"Maisie Bowman\",\n" +
            "    \"country\": \"Switzerland\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Cakewalk\",\n" +
            "      \"Chami\",\n" +
            "      \"Lycos\"\n" +
            "    ],\n" +
            "    \"company\": \"Eu Dolor Company\",\n" +
            "    \"email\": \"velit.justo@magnaNamligula.co.uk\",\n" +
            "    \"city\": \"Biała Podlaska\",\n" +
            "    \"name\": \"Odette Jefferson\",\n" +
            "    \"country\": \"Azerbaijan\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Google\"\n" +
            "    ],\n" +
            "    \"company\": \"Lacus Nulla Tincidunt Associates\",\n" +
            "    \"email\": \"Etiam@erateget.co.uk\",\n" +
            "    \"city\": \"Bloxham\",\n" +
            "    \"name\": \"Aidan Foster\",\n" +
            "    \"country\": \"Estonia\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Sibelius\"\n" +
            "    ],\n" +
            "    \"company\": \"Phasellus Dapibus Quam Limited\",\n" +
            "    \"email\": \"Maecenas@facilisis.org\",\n" +
            "    \"city\": \"Kallo\",\n" +
            "    \"name\": \"Lance Young\",\n" +
            "    \"country\": \"Palau\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Altavista\"\n" +
            "    ],\n" +
            "    \"company\": \"Amet Industries\",\n" +
            "    \"email\": \"sapien.cursus.in@leo.com\",\n" +
            "    \"city\": \"Giove\",\n" +
            "    \"name\": \"Ryan Chan\",\n" +
            "    \"country\": \"Sweden\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Apple Systems\",\n" +
            "      \"Borland\",\n" +
            "      \"Microsoft\"\n" +
            "    ],\n" +
            "    \"company\": \"Ante Dictum Limited\",\n" +
            "    \"email\": \"tortor@netus.co.uk\",\n" +
            "    \"city\": \"Codigoro\",\n" +
            "    \"name\": \"Kirk Holloway\",\n" +
            "    \"country\": \"Iraq\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Lycos\"\n" +
            "    ],\n" +
            "    \"company\": \"Massa Suspendisse Eleifend Inc.\",\n" +
            "    \"email\": \"sit.amet@Nunc.org\",\n" +
            "    \"city\": \"Southampton\",\n" +
            "    \"name\": \"Emerald Mclaughlin\",\n" +
            "    \"country\": \"Curaçao\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Lycos\",\n" +
            "      \"Finale\",\n" +
            "      \"Sibelius\"\n" +
            "    ],\n" +
            "    \"company\": \"Leo Cras Limited\",\n" +
            "    \"email\": \"Etiam.gravida@cursus.ca\",\n" +
            "    \"city\": \"Winnipeg\",\n" +
            "    \"name\": \"Jerry Nichols\",\n" +
            "    \"country\": \"Chad\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Cakewalk\"\n" +
            "    ],\n" +
            "    \"company\": \"Dolor Elit Pellentesque LLP\",\n" +
            "    \"email\": \"magna@veliteu.co.uk\",\n" +
            "    \"city\": \"Kessenich\",\n" +
            "    \"name\": \"Yuli Rutledge\",\n" +
            "    \"country\": \"South Georgia and The South Sandwich Islands\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Borland\",\n" +
            "      \"Lycos\"\n" +
            "    ],\n" +
            "    \"company\": \"Dui Nec Urna Limited\",\n" +
            "    \"email\": \"ut.pellentesque.eget@duinec.net\",\n" +
            "    \"city\": \"Coreglia Antelminelli\",\n" +
            "    \"name\": \"Anne Mcclure\",\n" +
            "    \"country\": \"Cook Islands\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Apple Systems\",\n" +
            "      \"Google\"\n" +
            "    ],\n" +
            "    \"company\": \"Nonummy Fusce Ltd\",\n" +
            "    \"email\": \"tincidunt.orci@convallisdolorQuisque.co.uk\",\n" +
            "    \"city\": \"Rennes\",\n" +
            "    \"name\": \"Ivan Riley\",\n" +
            "    \"country\": \"Burkina Faso\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Apple Systems\",\n" +
            "      \"Cakewalk\"\n" +
            "    ],\n" +
            "    \"company\": \"Etiam Ligula Consulting\",\n" +
            "    \"email\": \"vitae@metusInnec.org\",\n" +
            "    \"city\": \"San Miguel\",\n" +
            "    \"name\": \"Ignatius Tate\",\n" +
            "    \"country\": \"Saudi Arabia\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Chami\",\n" +
            "      \"Cakewalk\"\n" +
            "    ],\n" +
            "    \"company\": \"Dui Nec Tempus Inc.\",\n" +
            "    \"email\": \"dolor@adipiscingelitEtiam.org\",\n" +
            "    \"city\": \"Saint-Remy\",\n" +
            "    \"name\": \"Nyssa Hammond\",\n" +
            "    \"country\": \"Mozambique\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Macromedia\"\n" +
            "    ],\n" +
            "    \"company\": \"Aliquam Adipiscing Company\",\n" +
            "    \"email\": \"natoque@odioAliquam.ca\",\n" +
            "    \"city\": \"Vancouver\",\n" +
            "    \"name\": \"Vladimir Riddle\",\n" +
            "    \"country\": \"Jamaica\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Adobe\"\n" +
            "    ],\n" +
            "    \"company\": \"Id Nunc Incorporated\",\n" +
            "    \"email\": \"mi.felis@arcu.co.uk\",\n" +
            "    \"city\": \"Alcalá de Henares\",\n" +
            "    \"name\": \"Wylie Miller\",\n" +
            "    \"country\": \"Jersey\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Chami\",\n" +
            "      \"Borland\"\n" +
            "    ],\n" +
            "    \"company\": \"Ultricies Company\",\n" +
            "    \"email\": \"accumsan@vestibulumMaurismagna.ca\",\n" +
            "    \"city\": \"Moxhe\",\n" +
            "    \"name\": \"Kennan Walker\",\n" +
            "    \"country\": \"Falkland Islands\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Macromedia\",\n" +
            "      \"Apple Systems\"\n" +
            "    ],\n" +
            "    \"company\": \"Donec Nibh Enim Inc.\",\n" +
            "    \"email\": \"at@pellentesquemassa.edu\",\n" +
            "    \"city\": \"Fraserburgh\",\n" +
            "    \"name\": \"Whilemina Leonard\",\n" +
            "    \"country\": \"Greece\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Cakewalk\",\n" +
            "      \"Finale\"\n" +
            "    ],\n" +
            "    \"company\": \"Et Rutrum LLC\",\n" +
            "    \"email\": \"mattis.velit@Inornaresagittis.org\",\n" +
            "    \"city\": \"Albury\",\n" +
            "    \"name\": \"Suki Cohen\",\n" +
            "    \"country\": \"Hong Kong\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"\"\n" +
            "    ],\n" +
            "    \"company\": \"Cursus Incorporated\",\n" +
            "    \"email\": \"at@maurisblanditmattis.ca\",\n" +
            "    \"city\": \"Elen\",\n" +
            "    \"name\": \"Rashad Alexander\",\n" +
            "    \"country\": \"Fiji\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"\"\n" +
            "    ],\n" +
            "    \"company\": \"Mauris Corp.\",\n" +
            "    \"email\": \"consequat@aliquetmagna.ca\",\n" +
            "    \"city\": \"Bolsward\",\n" +
            "    \"name\": \"Karen Wheeler\",\n" +
            "    \"country\": \"Netherlands\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Lycos\",\n" +
            "      \"Yahoo\"\n" +
            "    ],\n" +
            "    \"company\": \"Nisi Magna Consulting\",\n" +
            "    \"email\": \"eu@vulputateullamcorpermagna.co.uk\",\n" +
            "    \"city\": \"Patna\",\n" +
            "    \"name\": \"Shellie Grant\",\n" +
            "    \"country\": \"Micronesia\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"\"\n" +
            "    ],\n" +
            "    \"company\": \"Curabitur Industries\",\n" +
            "    \"email\": \"ipsum.nunc@vitaevelit.org\",\n" +
            "    \"city\": \"Wenduine\",\n" +
            "    \"name\": \"Alana Freeman\",\n" +
            "    \"country\": \"Burkina Faso\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Altavista\",\n" +
            "      \"Yahoo\"\n" +
            "    ],\n" +
            "    \"company\": \"Sollicitudin Orci LLP\",\n" +
            "    \"email\": \"semper.Nam.tempor@ac.edu\",\n" +
            "    \"city\": \"Helmond\",\n" +
            "    \"name\": \"Joelle Fitzpatrick\",\n" +
            "    \"country\": \"Brazil\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Lycos\",\n" +
            "      \"Chami\",\n" +
            "      \"Google\"\n" +
            "    ],\n" +
            "    \"company\": \"Lorem Ac Consulting\",\n" +
            "    \"email\": \"Nunc@infelisNulla.co.uk\",\n" +
            "    \"city\": \"Juneau\",\n" +
            "    \"name\": \"Karina Henson\",\n" +
            "    \"country\": \"Dominica\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"\"\n" +
            "    ],\n" +
            "    \"company\": \"Ridiculus Ltd\",\n" +
            "    \"email\": \"arcu.et@Donecfeugiatmetus.org\",\n" +
            "    \"city\": \"Sparwood\",\n" +
            "    \"name\": \"Mohammad Byers\",\n" +
            "    \"country\": \"Albania\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Cakewalk\",\n" +
            "      \"Adobe\"\n" +
            "    ],\n" +
            "    \"company\": \"Erat Eget Ltd\",\n" +
            "    \"email\": \"mi@Cras.net\",\n" +
            "    \"city\": \"Sahiwal\",\n" +
            "    \"name\": \"Quon Farrell\",\n" +
            "    \"country\": \"Tonga\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Borland\",\n" +
            "      \"Cakewalk\"\n" +
            "    ],\n" +
            "    \"company\": \"Turpis Non Ltd\",\n" +
            "    \"email\": \"morbi.tristique.senectus@hendreritconsectetuercursus.ca\",\n" +
            "    \"city\": \"Sacramento\",\n" +
            "    \"name\": \"Cleo Hernandez\",\n" +
            "    \"country\": \"Viet Nam\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Adobe\"\n" +
            "    ],\n" +
            "    \"company\": \"Arcu Vel Quam Associates\",\n" +
            "    \"email\": \"arcu.imperdiet@ligulatortordictum.org\",\n" +
            "    \"city\": \"Owensboro\",\n" +
            "    \"name\": \"Herman Park\",\n" +
            "    \"country\": \"Guam\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Microsoft\",\n" +
            "      \"Apple Systems\"\n" +
            "    ],\n" +
            "    \"company\": \"Metus Industries\",\n" +
            "    \"email\": \"justo.faucibus.lectus@nec.ca\",\n" +
            "    \"city\": \"Mont\",\n" +
            "    \"name\": \"Alan Carver\",\n" +
            "    \"country\": \"Jamaica\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Finale\",\n" +
            "      \"Cakewalk\"\n" +
            "    ],\n" +
            "    \"company\": \"Gravida Sit Amet Corp.\",\n" +
            "    \"email\": \"at@sociisnatoque.ca\",\n" +
            "    \"city\": \"Sagamu\",\n" +
            "    \"name\": \"Jeremy Frederick\",\n" +
            "    \"country\": \"Kiribati\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"\"\n" +
            "    ],\n" +
            "    \"company\": \"Lorem Donec Elementum Associates\",\n" +
            "    \"email\": \"vel.convallis.in@metusInnec.com\",\n" +
            "    \"city\": \"Bridge of Allan\",\n" +
            "    \"name\": \"Rachel Guerra\",\n" +
            "    \"country\": \"Austria\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Adobe\",\n" +
            "      \"Yahoo\"\n" +
            "    ],\n" +
            "    \"company\": \"Eleifend Cras Sed Company\",\n" +
            "    \"email\": \"tempor.bibendum.Donec@gravidanon.org\",\n" +
            "    \"city\": \"Ratlam\",\n" +
            "    \"name\": \"Meredith Cross\",\n" +
            "    \"country\": \"Cyprus\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Borland\",\n" +
            "      \"Sibelius\",\n" +
            "      \"Microsoft\"\n" +
            "    ],\n" +
            "    \"company\": \"Mi Duis Risus PC\",\n" +
            "    \"email\": \"et@Maecenasiaculis.edu\",\n" +
            "    \"city\": \"Toowoomba\",\n" +
            "    \"name\": \"Jordan Bailey\",\n" +
            "    \"country\": \"Tuvalu\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Sibelius\"\n" +
            "    ],\n" +
            "    \"company\": \"Dui LLC\",\n" +
            "    \"email\": \"senectus.et@et.co.uk\",\n" +
            "    \"city\": \"Oosterhout\",\n" +
            "    \"name\": \"Reese Singleton\",\n" +
            "    \"country\": \"Pitcairn Islands\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Google\",\n" +
            "      \"Adobe\",\n" +
            "      \"Lycos\"\n" +
            "    ],\n" +
            "    \"company\": \"Vehicula Aliquet Corporation\",\n" +
            "    \"email\": \"Ut@afeugiattellus.edu\",\n" +
            "    \"city\": \"Inveraray\",\n" +
            "    \"name\": \"Nissim Bradshaw\",\n" +
            "    \"country\": \"Falkland Islands\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"\"\n" +
            "    ],\n" +
            "    \"company\": \"Dui Cum Sociis Ltd\",\n" +
            "    \"email\": \"risus.Quisque@tempuseu.com\",\n" +
            "    \"city\": \"Rivi?re-du-Loup\",\n" +
            "    \"name\": \"Iona Preston\",\n" +
            "    \"country\": \"Tanzania\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Lycos\"\n" +
            "    ],\n" +
            "    \"company\": \"Quis Arcu Company\",\n" +
            "    \"email\": \"ornare.In.faucibus@tinciduntadipiscingMauris.com\",\n" +
            "    \"city\": \"Friedberg\",\n" +
            "    \"name\": \"Hedwig Robbins\",\n" +
            "    \"country\": \"French Polynesia\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Lycos\",\n" +
            "      \"Sibelius\"\n" +
            "    ],\n" +
            "    \"company\": \"Fermentum Metus Aenean Associates\",\n" +
            "    \"email\": \"malesuada.Integer.id@blanditatnisi.com\",\n" +
            "    \"city\": \"Cleveland\",\n" +
            "    \"name\": \"Brittany Clayton\",\n" +
            "    \"country\": \"Bulgaria\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Sibelius\",\n" +
            "      \"Lycos\"\n" +
            "    ],\n" +
            "    \"company\": \"Quisque Limited\",\n" +
            "    \"email\": \"bibendum@convallisin.ca\",\n" +
            "    \"city\": \"Cuceglio\",\n" +
            "    \"name\": \"Sara Hobbs\",\n" +
            "    \"country\": \"Vanuatu\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Borland\",\n" +
            "      \"Finale\",\n" +
            "      \"Chami\"\n" +
            "    ],\n" +
            "    \"company\": \"Quis Pede Ltd\",\n" +
            "    \"email\": \"Cras.convallis@convallis.org\",\n" +
            "    \"city\": \"Gosnells\",\n" +
            "    \"name\": \"Rachel Cote\",\n" +
            "    \"country\": \"Papua New Guinea\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Chami\"\n" +
            "    ],\n" +
            "    \"company\": \"Mauris Eu Company\",\n" +
            "    \"email\": \"ultrices@vulputatemaurissagittis.ca\",\n" +
            "    \"city\": \"Wilhelmshaven\",\n" +
            "    \"name\": \"Kylynn Davenport\",\n" +
            "    \"country\": \"Guinea\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Adobe\"\n" +
            "    ],\n" +
            "    \"company\": \"Aliquam Limited\",\n" +
            "    \"email\": \"mattis.ornare@euultrices.com\",\n" +
            "    \"city\": \"Casanova Elvo\",\n" +
            "    \"name\": \"Kelly Becker\",\n" +
            "    \"country\": \"Bhutan\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Sibelius\",\n" +
            "      \"Apple Systems\"\n" +
            "    ],\n" +
            "    \"company\": \"Pharetra Nibh Incorporated\",\n" +
            "    \"email\": \"amet.ante@luctuslobortisClass.edu\",\n" +
            "    \"city\": \"Sesto al Reghena\",\n" +
            "    \"name\": \"Leandra Espinoza\",\n" +
            "    \"country\": \"Afghanistan\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Microsoft\"\n" +
            "    ],\n" +
            "    \"company\": \"Amet Faucibus Ut Corporation\",\n" +
            "    \"email\": \"non.lobortis.quis@tellusNunclectus.ca\",\n" +
            "    \"city\": \"Osnabr�ck\",\n" +
            "    \"name\": \"Geraldine Fitzgerald\",\n" +
            "    \"country\": \"Mauritius\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"\"\n" +
            "    ],\n" +
            "    \"company\": \"Integer Eu Corporation\",\n" +
            "    \"email\": \"faucibus.ut@libero.edu\",\n" +
            "    \"city\": \"Zaria\",\n" +
            "    \"name\": \"Sara Riggs\",\n" +
            "    \"country\": \"Lesotho\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Altavista\"\n" +
            "    ],\n" +
            "    \"company\": \"Natoque Penatibus Et Corp.\",\n" +
            "    \"email\": \"tristique.neque.venenatis@sedconsequatauctor.com\",\n" +
            "    \"city\": \"Sant'Eusanio Forconese\",\n" +
            "    \"name\": \"Omar Todd\",\n" +
            "    \"country\": \"Nicaragua\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"\"\n" +
            "    ],\n" +
            "    \"company\": \"Amet Metus Corporation\",\n" +
            "    \"email\": \"Phasellus@tempus.com\",\n" +
            "    \"city\": \"Elbląg\",\n" +
            "    \"name\": \"Warren Tran\",\n" +
            "    \"country\": \"Sierra Leone\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"\"\n" +
            "    ],\n" +
            "    \"company\": \"Leo In Incorporated\",\n" +
            "    \"email\": \"id.risus.quis@Nuncpulvinar.edu\",\n" +
            "    \"city\": \"Sagamu\",\n" +
            "    \"name\": \"Troy Simpson\",\n" +
            "    \"country\": \"Bangladesh\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Macromedia\",\n" +
            "      \"Altavista\",\n" +
            "      \"Apple Systems\"\n" +
            "    ],\n" +
            "    \"company\": \"Posuere LLP\",\n" +
            "    \"email\": \"Proin.vel@accumsan.edu\",\n" +
            "    \"city\": \"Celle\",\n" +
            "    \"name\": \"Tatyana Daniels\",\n" +
            "    \"country\": \"Comoros\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"\"\n" +
            "    ],\n" +
            "    \"company\": \"Erat Institute\",\n" +
            "    \"email\": \"aliquam.eu.accumsan@ante.com\",\n" +
            "    \"city\": \"Neunkirchen\",\n" +
            "    \"name\": \"Amber Morris\",\n" +
            "    \"country\": \"Montserrat\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Microsoft\"\n" +
            "    ],\n" +
            "    \"company\": \"Luctus Lobortis Class Incorporated\",\n" +
            "    \"email\": \"Nulla.tincidunt@nulla.net\",\n" +
            "    \"city\": \"Cerignola\",\n" +
            "    \"name\": \"Castor Marks\",\n" +
            "    \"country\": \"Togo\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Finale\",\n" +
            "      \"Yahoo\",\n" +
            "      \"Altavista\"\n" +
            "    ],\n" +
            "    \"company\": \"Egestas Hendrerit PC\",\n" +
            "    \"email\": \"pulvinar.arcu.et@sodalesat.co.uk\",\n" +
            "    \"city\": \"Wilhelmshaven\",\n" +
            "    \"name\": \"Shafira Duncan\",\n" +
            "    \"country\": \"Oman\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Yahoo\",\n" +
            "      \"Lycos\"\n" +
            "    ],\n" +
            "    \"company\": \"At Nisi Cum Company\",\n" +
            "    \"email\": \"elit.sed@Phasellus.ca\",\n" +
            "    \"city\": \"Palayankottai\",\n" +
            "    \"name\": \"Hedy Sexton\",\n" +
            "    \"country\": \"Ghana\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"\"\n" +
            "    ],\n" +
            "    \"company\": \"Nunc Institute\",\n" +
            "    \"email\": \"at.velit.Cras@quispede.edu\",\n" +
            "    \"city\": \"Cuxhaven\",\n" +
            "    \"name\": \"Joshua Mendoza\",\n" +
            "    \"country\": \"Austria\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Google\",\n" +
            "      \"Lavasoft\"\n" +
            "    ],\n" +
            "    \"company\": \"Lorem Vehicula Et LLP\",\n" +
            "    \"email\": \"gravida.sit@luctus.net\",\n" +
            "    \"city\": \"G�ttingen\",\n" +
            "    \"name\": \"Sarah Keller\",\n" +
            "    \"country\": \"Mauritania\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Google\",\n" +
            "      \"Cakewalk\"\n" +
            "    ],\n" +
            "    \"company\": \"Cras Lorem Lorem Corporation\",\n" +
            "    \"email\": \"egestas@utcursus.ca\",\n" +
            "    \"city\": \"Kalgoorlie-Boulder\",\n" +
            "    \"name\": \"Kiayada Floyd\",\n" +
            "    \"country\": \"Martinique\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Lycos\",\n" +
            "      \"Sibelius\"\n" +
            "    ],\n" +
            "    \"company\": \"Ante Ipsum Incorporated\",\n" +
            "    \"email\": \"Maecenas.ornare@consectetuer.org\",\n" +
            "    \"city\": \"Liberia\",\n" +
            "    \"name\": \"Kelly Ochoa\",\n" +
            "    \"country\": \"Poland\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Sibelius\",\n" +
            "      \"Lavasoft\"\n" +
            "    ],\n" +
            "    \"company\": \"Enim Nunc Incorporated\",\n" +
            "    \"email\": \"eget.venenatis.a@felisNullatempor.org\",\n" +
            "    \"city\": \"Ratlam\",\n" +
            "    \"name\": \"Dolan Vincent\",\n" +
            "    \"country\": \"Somalia\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Google\",\n" +
            "      \"Sibelius\"\n" +
            "    ],\n" +
            "    \"company\": \"Nulla Company\",\n" +
            "    \"email\": \"molestie.sodales.Mauris@quam.edu\",\n" +
            "    \"city\": \"De Klinge\",\n" +
            "    \"name\": \"Joy Robinson\",\n" +
            "    \"country\": \"Kazakhstan\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Google\",\n" +
            "      \"Adobe\"\n" +
            "    ],\n" +
            "    \"company\": \"Nam Limited\",\n" +
            "    \"email\": \"et.arcu@lectusjustoeu.org\",\n" +
            "    \"city\": \"Tilburg\",\n" +
            "    \"name\": \"Ronan Wood\",\n" +
            "    \"country\": \"Hong Kong\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Yahoo\"\n" +
            "    ],\n" +
            "    \"company\": \"Lectus Company\",\n" +
            "    \"email\": \"blandit@Vivamus.co.uk\",\n" +
            "    \"city\": \"Sant'Onofrio\",\n" +
            "    \"name\": \"Jared Miles\",\n" +
            "    \"country\": \"Montenegro\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Microsoft\"\n" +
            "    ],\n" +
            "    \"company\": \"Nulla Integer Incorporated\",\n" +
            "    \"email\": \"Quisque.libero.lacus@libero.org\",\n" +
            "    \"city\": \"Jonqui�re\",\n" +
            "    \"name\": \"Wing Ingram\",\n" +
            "    \"country\": \"Heard Island and Mcdonald Islands\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Yahoo\",\n" +
            "      \"Macromedia\"\n" +
            "    ],\n" +
            "    \"company\": \"Ac Incorporated\",\n" +
            "    \"email\": \"risus@diamat.edu\",\n" +
            "    \"city\": \"Ofena\",\n" +
            "    \"name\": \"Otto Gaines\",\n" +
            "    \"country\": \"Puerto Rico\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Sibelius\"\n" +
            "    ],\n" +
            "    \"company\": \"Tempus Lorem Incorporated\",\n" +
            "    \"email\": \"mi.lacinia@lacus.com\",\n" +
            "    \"city\": \"Subbiano\",\n" +
            "    \"name\": \"Savannah Parks\",\n" +
            "    \"country\": \"Thailand\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Borland\",\n" +
            "      \"Adobe\"\n" +
            "    ],\n" +
            "    \"company\": \"Donec Foundation\",\n" +
            "    \"email\": \"eros.Nam@duiin.com\",\n" +
            "    \"city\": \"Kermt\",\n" +
            "    \"name\": \"Prescott Moon\",\n" +
            "    \"country\": \"Kazakhstan\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"\"\n" +
            "    ],\n" +
            "    \"company\": \"Et Rutrum Ltd\",\n" +
            "    \"email\": \"tellus.eu.augue@dolorsit.net\",\n" +
            "    \"city\": \"New Glasgow\",\n" +
            "    \"name\": \"Sydney Bennett\",\n" +
            "    \"country\": \"Kyrgyzstan\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Sibelius\"\n" +
            "    ],\n" +
            "    \"company\": \"Ipsum Dolor Institute\",\n" +
            "    \"email\": \"per.inceptos.hymenaeos@Nullam.ca\",\n" +
            "    \"city\": \"Nuragus\",\n" +
            "    \"name\": \"Rahim Bell\",\n" +
            "    \"country\": \"Tonga\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Sibelius\"\n" +
            "    ],\n" +
            "    \"company\": \"In Ltd\",\n" +
            "    \"email\": \"turpis@Integer.co.uk\",\n" +
            "    \"city\": \"Greifswald\",\n" +
            "    \"name\": \"Myles Clemons\",\n" +
            "    \"country\": \"Iraq\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"\"\n" +
            "    ],\n" +
            "    \"company\": \"Mollis Duis Sit PC\",\n" +
            "    \"email\": \"dolor@orciUt.org\",\n" +
            "    \"city\": \"San Donato di Ninea\",\n" +
            "    \"name\": \"Daniel Maddox\",\n" +
            "    \"country\": \"Belgium\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Macromedia\"\n" +
            "    ],\n" +
            "    \"company\": \"Integer Urna Vivamus LLP\",\n" +
            "    \"email\": \"nec@luctusCurabitur.net\",\n" +
            "    \"city\": \"Altamura\",\n" +
            "    \"name\": \"Bree Reilly\",\n" +
            "    \"country\": \"New Zealand\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Finale\"\n" +
            "    ],\n" +
            "    \"company\": \"Est Company\",\n" +
            "    \"email\": \"montes@fermentumconvallisligula.co.uk\",\n" +
            "    \"city\": \"Gibbons\",\n" +
            "    \"name\": \"Hilel Neal\",\n" +
            "    \"country\": \"Tunisia\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Cakewalk\",\n" +
            "      \"Yahoo\"\n" +
            "    ],\n" +
            "    \"company\": \"Nunc Corp.\",\n" +
            "    \"email\": \"ultrices@lectusantedictum.edu\",\n" +
            "    \"city\": \"Tiverton\",\n" +
            "    \"name\": \"Uriel Weiss\",\n" +
            "    \"country\": \"Bosnia and Herzegovina\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Microsoft\",\n" +
            "      \"Finale\"\n" +
            "    ],\n" +
            "    \"company\": \"Id Risus Quis Associates\",\n" +
            "    \"email\": \"urna@a.org\",\n" +
            "    \"city\": \"Asti\",\n" +
            "    \"name\": \"Ursa Patton\",\n" +
            "    \"country\": \"Malta\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Yahoo\"\n" +
            "    ],\n" +
            "    \"company\": \"Vitae Velit Egestas Industries\",\n" +
            "    \"email\": \"eleifend.Cras@Etiamimperdietdictum.net\",\n" +
            "    \"city\": \"Watford\",\n" +
            "    \"name\": \"Lance Young\",\n" +
            "    \"country\": \"Gambia\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Borland\",\n" +
            "      \"Altavista\",\n" +
            "      \"Adobe\"\n" +
            "    ],\n" +
            "    \"company\": \"Mollis Phasellus Corporation\",\n" +
            "    \"email\": \"Donec.consectetuer@ac.net\",\n" +
            "    \"city\": \"Castello di Godego\",\n" +
            "    \"name\": \"Alyssa Jensen\",\n" +
            "    \"country\": \"Holy See (Vatican City State)\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Cakewalk\",\n" +
            "      \"Yahoo\"\n" +
            "    ],\n" +
            "    \"company\": \"Commodo Hendrerit Corporation\",\n" +
            "    \"email\": \"sit@loremfringilla.net\",\n" +
            "    \"city\": \"Bad Ischl\",\n" +
            "    \"name\": \"Lois Lambert\",\n" +
            "    \"country\": \"El Salvador\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"\"\n" +
            "    ],\n" +
            "    \"company\": \"Augue LLC\",\n" +
            "    \"email\": \"Praesent.eu.dui@sociisnatoquepenatibus.co.uk\",\n" +
            "    \"city\": \"Alma\",\n" +
            "    \"name\": \"Tasha Barker\",\n" +
            "    \"country\": \"Syria\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"job_history\": [\n" +
            "      \"Lycos\",\n" +
            "      \"Microsoft\"\n" +
            "    ],\n" +
            "    \"company\": \"Et Nunc Inc.\",\n" +
            "    \"email\": \"Pellentesque.ut.ipsum@ametnullaDonec.org\",\n" +
            "    \"city\": \"Sefro\",\n" +
            "    \"name\": \"Craig Jackson\",\n" +
            "    \"country\": \"Sao Tome and Principe\"\n" +
            "  }\n" +
            "]";

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("person", new Person());
        return "form";
    }

    @RequestMapping("/search")
    public String search(Model model) throws IOException {
        model.addAttribute("results", loadContacts());
        return "result";
    }

    private static List<Person> loadContacts() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(jsonContacts, objectMapper.getTypeFactory().constructCollectionType(List.class, Person.class));
    }

}
