DOCUMENTS=M0_U3_1.pdf

all: $(DOCUMENTS)

M0_U3_1.pdf: M0_U3_1.md M0_U3_1.bib
	pandoc -s M0_U3_1.md --bibliography M0_U3_1.bib --pdf-engine=xelatex -o $@

clean:
	$(RM) -f $(DOCUMENTS)
	$(RM) -f *~ *.*~

