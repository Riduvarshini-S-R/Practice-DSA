'''In graph, if the edges are given:
   For example; {[0,1],[0,3],[1,2],[2,3]}, then the dependencies can be identified by creating an array of length of number of vertices and initializing it to 0, if a node is dependent, 
   append it to the index where nodeValue=index
      Output : {[1,3],[2],[3]}'''

'''sum of dependencies - add all the lengths of individual lists in the list'''

vertices,edges=map(int,input().strip().split())
edgePairs = [[] for i in range(vertices)]
e = list(map(int,input().strip().split()))
        for i in range(0,2*edges,2):
            x=e[i]
            y=e[i+1]
            e[x].append(y)
