class StockSpanner {
    List<Integer> price_arr = new ArrayList<>();
     List<Integer> span_arr = new ArrayList<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int index = price_arr.size()-1;
        while(index>=0 && price_arr.get(index)<=price){
            int span_value = span_arr.get(index);
            index = index-span_value;
        }
        price_arr.add(price);
        int span_value = price_arr.size()-1-index;
        span_arr.add(span_value);
        return span_value;
    }
}