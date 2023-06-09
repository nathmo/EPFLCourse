function [err,t,f,x,p]=intlag(n)
%
%Etant donne un entier n et une fonction continue f,
%le programme interpole la fonction f par un polynome p
%de degre n aux points d interpolation t(1),t(2),...,t(n),t(n+1).
%parametres:
%  entree : n
%  sortie : err : erreur max entre la fonction f et l interpolant p
%           t   : (n+1) vecteur contenant les points d interpolation
%           f   : (n+1) vecteur contenant les valeurs de la fonction f aux points d interpolation
%           x   : vecteur contenant 1001 points uniformement distribues sur [-1,1]
%           p   : vecteur contenant les valeurs du polynome p au point x(i)
%
%
%initialisation des vecteurs t et f
%
for i=1:n+1
  t(i)=-1+(2.*(i-1))/n;
  f(i)=funct(t(i));
end
%
%calcul de la valeur du polynome d interpolation au point x(i)
%
m=1000;
err=0;
for i=1:m+1
  x(i)=cos((2*i+1)*pi)/(2*(m+1));
  p(i)=0;
  for j=1:n+1
    p(i) = p(i) + f(j) * phi(j,n,x(i),t);
  end
  err = max(err,abs(p(i)-funct(x(i))));
end
end

%calcul de phi_j (la j_ieme fonction de la base de Lagrange)
function basis = phi(j,n,xx,t)
basis=1;
for k=1:n+1
  if k ~= j
    basis = basis * (xx-t(k))/(t(j)-t(k)) ;
  end
end
end

%fonction a interpoler
function f = funct(xx)
f = 1/(1+25*(xx)^2);
end
