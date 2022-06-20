Rails.application.routes.draw do
  # get 'todos/index'
  # get 'todos/home'
  match 'h', :to =>'todos#home', :via => 'get'
  match 'i', :to =>'todos#index', :via => 'get'
  match 's', :to =>'todos#sign_up', :via => 'get'
  # For details on the DSL available within this file, see https://guides.rubyonrails.org/routing.html
end
