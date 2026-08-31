// Last updated: 8/31/2026, 2:36:34 PM
1class Solution {
2    public List<String> subdomainVisits(String[] cpdomains) {
3        HashMap<String,Integer> h=new HashMap<>();
4        for(String s:cpdomains){
5            String[] st=s.split(" ");
6            int c=Integer.parseInt(st[0]);
7            String d=st[1];
8
9            String[] sd=d.split("\\.");
10            String curr="";
11            for(int i=sd.length-1;i>=0;i--)
12            {
13                if(curr.equals(""))
14                {
15                    curr=sd[i];
16                }
17                else
18                {
19                    curr=sd[i]+"."+curr;
20                }
21                h.put(curr,h.getOrDefault(curr,0)+c);
22            }
23        }
24          List<String> result = new ArrayList<>();
25
26        for (String domain : h.keySet()) {
27            result.add(h.get(domain) + " " + domain);
28        }
29
30        return result;
31    }
32}