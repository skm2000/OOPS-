
myServer = {
    "server1" : 
    {
        "name" : "AWS",
        "IPv4" : "10.10.100.80",
        "port" : [80,234,443]
    },

    "server2":
    {
        "name" : "GCP",
        "IPv4" : "45.87.78.128",
        "port" : [80,234,443]
    },

    "server3" : 
    {
        "name" : "Linode",
        "IPv4" : "170.10.251.84",
        "port" : [80,234,443]
    },

    "server4" : 
    {
        "name" : "Azure",
        "IPv4" : "172.230.105.200",
        "port" : [80,234,443]
    },

    "server5" : 
    {
        "name" : "Digital Ocean",
        "IPv4" : "20.60.172.01",
        "port" : [80,234,443]
    },

    "server6" : 
    {
        "name" : "LocalHost",
        "IPv4" : "127.0.0.1",
        "port" : [80,234,443]
    }
}

# this function just shows the all server details
def printServers(**kwargs):

    for server, details in kwargs.items():
        print("\nserver name: {}".format(details["name"]))
        print("server IPv4 address: {}".format(details["IPv4"]))
        print("server open port: {}".format(details["port"]))
        print("\n#############################")

if __name__ == "__main__":

    printServers(**myServer)