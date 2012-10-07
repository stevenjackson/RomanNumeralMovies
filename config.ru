require 'rubygems'
require 'lib/application'

set :run, false
set :environment, :production

run Sinatra::Application
