import java.util.*;

/**
   Chapter 18, Programming Challenge 4
*/

public class StockMap
{
   private Map<String, Stock> stocks;
   
   /**
      Constructor
   */
   
   public StockMap()
   { 
      stocks = new HashMap<>();
   }
   
   /**
      The add method puts a mapping into the map.
      It maps a stock symbol with the Stock object.
      @param stock The stock object.
   */
   
   public void add(Stock stock)
   {
      // Put a mapping into the map. The stock
      // symbol is the key.
      stocks.put(stock.getSymbol(), stock);
   }
   
   /**
      The getStock method retrieves the Stock object
      that is associated with a symbol.
      @param symbol The symbol for a stock/
      @return The Stock object associated with the symbol
              or null if the symbol is not found.
   */
   
   public Stock getStock(String symbol)
   {
      return stocks.get(symbol);
   }
}