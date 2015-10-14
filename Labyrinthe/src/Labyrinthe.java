import java.util.Arrays;


public class Labyrinthe {
	private int[][] map ;
	
	public Labyrinthe() {
		map = new int[][]{{1,1,1,1,1,1,1,1,1,1},{1,1,0,0,0,0,1,1,0,1},{1,1,0,1,0,1,1,0,0,1},{1,0,0,1,0,0,1,0,1,1},{1,0,1,0,0,1,1,0,0,1},{1,0,1,1,0,1,1,1,0,1},{1,0,1,1,0,0,0,0,0,0},{1,0,0,0,0,1,1,1,1,1},{1,0,1,1,0,0,0,0,0,1},{1,1,1,1,1,1,1,1,1,1}};
	}
	
	public int getCase(int x,int y)
	{
		//System.out.println("test case " + x + " " + y);
		return map[x][y];
	}
	
	public void afficherLabyrinthe()
	{
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				switch(getCase(i, j))
				{
				case 0:
					System.out.print("  ");
					break;
				case 1:
					System.out.print("* ");
					break;
				case 2:
					System.out.print(". ");
					break;
				}
				 
			}
			System.out.print("\n");
		}
	}
	

	
	public boolean existeChemin(int x,int y)
	{
		
		if(this.getCase(x, y) == 0 && (x==0||x==this.map.length-1||y==0||y==this.map.length-1))
		{
			this.map[x][y] = 2;
			return true;
		}
		
		if(this.getCase(x, y) == 1 || this.getCase(x, y) == 2)
		{
			return false;
		}
		this.map[x][y] = 2;
		if(this.existeChemin(x,y+1))
			{
				return true;
			}
			else if(this.existeChemin(x+1,y))
			{
				return true;
			}
			else if(this.existeChemin(x,y-1))
			{
				return true;
			}
			else if(this.existeChemin(x-1,y))
			{
				return true;
			}
		this.map[x][y] = 0;
		return false;
	}

	public String toString() {
		return "Labyrinthe [map=" + Arrays.toString(map) + "]";
	}
	
	

}
