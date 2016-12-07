package controller;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/")
public class CheckersApp {

   /**
    * TODO: Create useful end points. This can and should be removed. It purely
    * servers as an example.
    */
   @GET
   @Path("/")
   @Produces({MediaType.APPLICATION_JSON})
   public HashMap<String, String> getCheckers() {
      HashMap<String, String> exampleObject = new HashMap();
      exampleObject.put("hello", "world");
      return exampleObject;
   }

   @GET
   @Path("/rules")
   @Produces({MediaType.APPLICATION_JSON})
   public String getRules() {
/* <h2><span class="mw-headline" id="History">History</span><span class="mw-editsection"><span class="mw-editsection-bracket">[</span><a href="/w/index.php?title=Checkers&amp;veaction=edit&amp;section=1" class="mw-editsection-visualeditor" title="Change section: History">change</a><span class="mw-editsection-divider"> | </span><a href="/w/index.php?title=Checkers&amp;action=edit&amp;section=1" title="Change section: History">change source</a><span class="mw-editsection-bracket">]</span></span></h2>
<p>Checkers dates back to the 12th century, in France.<sup id="cite_ref-2" class="reference"><a href="#cite_note-2">[2]</a></sup><sup id="cite_ref-Bell_1-1" class="reference"><a href="#cite_note-Bell-1">[1]</a></sup> There are two main types of checkers played: the Anglo-American version (which originally came from France) and the Polish or continental version. The Anglo-American version is played on an 8x8 checkerboard with 12 pieces. The continental version (so-called because it is played on the continent of Europe) is played on a 10x10 board with 20 pieces each. There are also a number of variations in various countries.</p>
<h2><span class="mw-headline" id="Rules">Rules</span><span class="mw-editsection"><span class="mw-editsection-bracket">[</span><a href="/w/index.php?title=Checkers&amp;veaction=edit&amp;section=2" class="mw-editsection-visualeditor" title="Change section: Rules">change</a><span class="mw-editsection-divider"> | </span><a href="/w/index.php?title=Checkers&amp;action=edit&amp;section=2" title="Change section: Rules">change source</a><span class="mw-editsection-bracket">]</span></span></h2>
<div class="thumb tright">
<div class="thumbinner" style="width:203px;"><a href="/wiki/File:Draughts.png" class="image"><img alt="" src="//upload.wikimedia.org/wikipedia/commons/b/bc/Draughts.png" width="201" height="201" class="thumbimage" data-file-width="201" data-file-height="201" /></a>
<div class="thumbcaption">
<div class="magnify"><a href="/wiki/File:Draughts.png" class="internal" title="Enlarge"></a></div>
Pieces when game starts</div>
</div>
</div>
<p>In most games of checkers, there are two players. The players are at opposite ends of the board. One player has dark pieces, and one player has light pieces. They take turns moving their pieces. Players move their pieces <a href="/wiki/Diagonal" title="Diagonal">diagonally</a> from one square to another square. When a player jumps over their opponent's (the other player's) piece, you take that piece from the board. If you can take a piece, then you must take a piece.</p>
<h3><span class="mw-headline" id="English_draughts">English draughts</span><span class="mw-editsection"><span class="mw-editsection-bracket">[</span><a href="/w/index.php?title=Checkers&amp;veaction=edit&amp;section=3" class="mw-editsection-visualeditor" title="Change section: English draughts">change</a><span class="mw-editsection-divider"> | </span><a href="/w/index.php?title=Checkers&amp;action=edit&amp;section=3" title="Change section: English draughts">change source</a><span class="mw-editsection-bracket">]</span></span></h3>
<p>British people call the game "draughts". The American name is <i>American checkers</i>. English draughts is played on an 8x8 checkerboard. Only the dark squares are used: the light squares are never used.</p>
<ul>
<li><b>Pieces</b>. The pieces are flat and round. They are referred to as "men". They may be colored dark and light or red and white. The two sides are called <i>Black</i> and <i>White</i>.<sup id="cite_ref-Bell_1-2" class="reference"><a href="#cite_note-Bell-1">[1]</a></sup> Black has the first move. There are two kinds of pieces: plain (single) pieces and "kings". Once made, a king is designated by putting one plain piece on top of another, or perhaps turning the man over if there are no available taken pieces to use (and sides of the pieces look slightly different).</li>
<li><b>Starting position</b>. Each player starts with 12 pieces on the three rows closest to their own side. The row closest to each player is called the "King Row". The darker color moves first.</li>
<li><b>How to move</b>. all the single pieces (the starting pieces) can only move diagonally forward. They cannot move backwards.</li>
</ul>
<p>A player can move in two ways. A piece can be moved forward, diagonally, to the very next dark square. If one player's piece, the other player's piece, and an empty square are lined up, then the first player <i>must</i> "jump" the other player's piece. The first player jumps over the other player's piece onto the empty square and takes the other player's piece off the board. A player can also use one piece to make multiple jumps in any one single turn, provided each jump continues to lead immediately into the next jump and in a straight line. Sometimes a player may have the option or a choice of which opponent piece he must jump. In such cases, he may then choose which to jump. If you keep your hand on any piece when you're moving, you have the choice to put it back and move another piece. In English draughts, players can only jump other pieces forwards, whereas in Russian draughts and international draughts, players can jump backwards.</p>
<ul>
<li><b>Kings</b>. If a player's piece moves into back rank (the King Row) on the other player's side, it becomes a king. It can move forwards and backwards. A king cannot move out of the King Row until the next turn. In English draughts, a king's only advantage over a man is the ability to move and capture backwards as well as forwards. In international draughts, flying kings can move to squares diagonally at any distance. Flying kings are not used in English draughts, as a king's ability is to move forwards as well as backwards.</li>
<li><b>How the game ends</b>. The first player to lose all of his or her pieces loses the game. If a player is put in a position where they cannot move, they lose.<sup id="cite_ref-darkfish_3-0" class="reference"><a href="#cite_note-darkfish-3">[3]</a></sup> If the players have the same amount of pieces, the player with the most kings wins. If the players have an equal number of pieces and the same number of kings the game is a draw.</li>
</ul>
*/
	   StringWriter rules = new StringWriter();
	   rules.append( 
			   "<h2><span id=\"History\">History</span></h2>");

	   rules.append(
			   "<p>Checkers dates back to the 12th century, in France. There are two main types of checkers played: the Anglo-American version (which originally came from France) and the Polish or continental version. The Anglo-American version is played on an 8x8 checkerboard with 12 pieces. The continental version (so-called because it is played on the continent of Europe) is played on a 10x10 board with 20 pieces each. There are also a number of variations in various countries.</p>");
	   rules.append(
			   "<h2><span id=\"Rules\">Rules</span></h2>");
	   rules.append(
			   "<p>In most games of checkers, there are two players. The players are at opposite ends of the board. One player has dark pieces, and one player has light pieces. They take turns moving their pieces. Players move their pieces <b>diagonally</b> from one square to another square. When a player jumps over their opponent's (the other player's) piece, you take that piece from the board. If you can take a piece, then you must take a piece.</p>");
	   rules.append(
			   "<h3>English draughts</h3>");
	   rules.append(
			   "<p>British people call the game \"draughts\". The American name is <i>American checkers</i>. English draughts is played on an 8x8 checkerboard. Only the dark squares are used: the light squares are never used.</p>");
	   rules.append("<ul>");
	   rules.append(
			   "<li><b>Pieces</b>. The pieces are flat and round. They are referred to as \"men\". They may be colored dark and light or red and white. The two sides are called <i>Black</i> and <i>White</i>. Black has the first move. There are two kinds of pieces: plain (single) pieces and \"kings\". Once made, a king is designated by putting one plain piece on top of another, or perhaps turning the man over if there are no available taken pieces to use (and sides of the pieces look slightly different).</li>");
	   rules.append(
			   "<li><b>Starting position</b>. Each player starts with 12 pieces on the three rows closest to their own side. The row closest to each player is called the \"King Row\". The darker color moves first.</li>");
	   rules.append(
			   "<li><b>How to move</b>. all the single pieces (the starting pieces) can only move diagonally forward. They cannot move backwards.</li>");
	   rules.append("</ul>");
	   rules.append(
			   "<p>A player can move in two ways. A piece can be moved forward, diagonally, to the very next dark square. If one player's piece, the other player's piece, and an empty square are lined up, then the first player <i>must</i> \"jump\" the other player's piece. The first player jumps over the other player's piece onto the empty square and takes the other player's piece off the board. A player can also use one piece to make multiple jumps in any one single turn, provided each jump continues to lead immediately into the next jump and in a straight line. Sometimes a player may have the option or a choice of which opponent piece he must jump. In such cases, he may then choose which to jump. If you keep your hand on any piece when you're moving, you have the choice to put it back and move another piece.");
	   rules.append("In English draughts, players can only jump other pieces forwards, whereas in Russian draughts and international draughts, players can jump backwards.</p>");
	   rules.append("<ul>");
	   rules.append(
			   "<li><b>Kings</b>. If a player's piece moves into back rank (the King Row) on the other player's side, it becomes a king. It can move forwards and backwards. A king cannot move out of the King Row until the next turn. In English draughts, a king's only advantage over a man is the ability to move and capture backwards as well as forwards. In international draughts, flying kings can move to squares diagonally at any distance. Flying kings are not used in English draughts, as a king's ability is to move forwards as well as backwards.</li>");
	   rules.append(
			   "<li><b>How the game ends</b>. The first player to lose all of his or her pieces loses the game. If a player is put in a position where they cannot move, they lose.");
	   rules.append("If the players have the same amount of pieces, the player with the most kings wins. If the players have an equal number of pieces and the same number of kings the game is a draw.</li>");
	   rules.append("</ul>");
      
      return rules.toString();
   }
}
