package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'external'", "'('", "','", "')'", "'var'", "'='", "'+'", "'-'", "'*'", "'/'", "'let'", "'in'", "'end'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }



     	private MathGrammarAccess grammarAccess;

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalMath.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMath.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMath.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMath.g:71:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externalDeclarations_2_0= ruleExternalDeclaration ) )* ( (lv_exp_3_0= ruleMathExp ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_externalDeclarations_2_0 = null;

        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externalDeclarations_2_0= ruleExternalDeclaration ) )* ( (lv_exp_3_0= ruleMathExp ) ) ) )
            // InternalMath.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externalDeclarations_2_0= ruleExternalDeclaration ) )* ( (lv_exp_3_0= ruleMathExp ) ) )
            {
            // InternalMath.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externalDeclarations_2_0= ruleExternalDeclaration ) )* ( (lv_exp_3_0= ruleMathExp ) ) )
            // InternalMath.g:79:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externalDeclarations_2_0= ruleExternalDeclaration ) )* ( (lv_exp_3_0= ruleMathExp ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            // InternalMath.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMath.g:101:3: ( (lv_externalDeclarations_2_0= ruleExternalDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:102:4: (lv_externalDeclarations_2_0= ruleExternalDeclaration )
            	    {
            	    // InternalMath.g:102:4: (lv_externalDeclarations_2_0= ruleExternalDeclaration )
            	    // InternalMath.g:103:5: lv_externalDeclarations_2_0= ruleExternalDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getExternalDeclarationsExternalDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_externalDeclarations_2_0=ruleExternalDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"externalDeclarations",
            	    						lv_externalDeclarations_2_0,
            	    						"dk.sdu.mmmi.mdsd.Math.ExternalDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMath.g:120:3: ( (lv_exp_3_0= ruleMathExp ) )
            // InternalMath.g:121:4: (lv_exp_3_0= ruleMathExp )
            {
            // InternalMath.g:121:4: (lv_exp_3_0= ruleMathExp )
            // InternalMath.g:122:5: lv_exp_3_0= ruleMathExp
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getExpMathExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleMathExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"dk.sdu.mmmi.mdsd.Math.MathExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleExternalDeclaration"
    // InternalMath.g:143:1: entryRuleExternalDeclaration returns [EObject current=null] : iv_ruleExternalDeclaration= ruleExternalDeclaration EOF ;
    public final EObject entryRuleExternalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDeclaration = null;


        try {
            // InternalMath.g:143:60: (iv_ruleExternalDeclaration= ruleExternalDeclaration EOF )
            // InternalMath.g:144:2: iv_ruleExternalDeclaration= ruleExternalDeclaration EOF
            {
             newCompositeNode(grammarAccess.getExternalDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalDeclaration=ruleExternalDeclaration();

            state._fsp--;

             current =iv_ruleExternalDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalDeclaration"


    // $ANTLR start "ruleExternalDeclaration"
    // InternalMath.g:150:1: ruleExternalDeclaration returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_typeParameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_typeParameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleExternalDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_typeParameters_3_0=null;
        Token otherlv_4=null;
        Token lv_typeParameters_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMath.g:156:2: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_typeParameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_typeParameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' ) )
            // InternalMath.g:157:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_typeParameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_typeParameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' )
            {
            // InternalMath.g:157:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_typeParameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_typeParameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' )
            // InternalMath.g:158:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_typeParameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_typeParameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalDeclarationAccess().getExternalKeyword_0());
            		
            // InternalMath.g:162:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:163:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:163:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:164:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalDeclarationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMath.g:184:3: ( ( (lv_typeParameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_typeParameters_5_0= RULE_ID ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMath.g:185:4: ( (lv_typeParameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_typeParameters_5_0= RULE_ID ) ) )*
                    {
                    // InternalMath.g:185:4: ( (lv_typeParameters_3_0= RULE_ID ) )
                    // InternalMath.g:186:5: (lv_typeParameters_3_0= RULE_ID )
                    {
                    // InternalMath.g:186:5: (lv_typeParameters_3_0= RULE_ID )
                    // InternalMath.g:187:6: lv_typeParameters_3_0= RULE_ID
                    {
                    lv_typeParameters_3_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_typeParameters_3_0, grammarAccess.getExternalDeclarationAccess().getTypeParametersIDTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExternalDeclarationRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"typeParameters",
                    							lv_typeParameters_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMath.g:203:4: (otherlv_4= ',' ( (lv_typeParameters_5_0= RULE_ID ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMath.g:204:5: otherlv_4= ',' ( (lv_typeParameters_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getExternalDeclarationAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalMath.g:208:5: ( (lv_typeParameters_5_0= RULE_ID ) )
                    	    // InternalMath.g:209:6: (lv_typeParameters_5_0= RULE_ID )
                    	    {
                    	    // InternalMath.g:209:6: (lv_typeParameters_5_0= RULE_ID )
                    	    // InternalMath.g:210:7: lv_typeParameters_5_0= RULE_ID
                    	    {
                    	    lv_typeParameters_5_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    	    							newLeafNode(lv_typeParameters_5_0, grammarAccess.getExternalDeclarationAccess().getTypeParametersIDTerminalRuleCall_3_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getExternalDeclarationRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"typeParameters",
                    	    								lv_typeParameters_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExternalDeclarationAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalDeclaration"


    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:236:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMath.g:236:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMath.g:237:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:243:1: ruleMathExp returns [EObject current=null] : ( () ( (lv_variables_1_0= ruleVarBinding ) )* ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        EObject lv_variables_1_0 = null;



        	enterRule();

        try {
            // InternalMath.g:249:2: ( ( () ( (lv_variables_1_0= ruleVarBinding ) )* ) )
            // InternalMath.g:250:2: ( () ( (lv_variables_1_0= ruleVarBinding ) )* )
            {
            // InternalMath.g:250:2: ( () ( (lv_variables_1_0= ruleVarBinding ) )* )
            // InternalMath.g:251:3: () ( (lv_variables_1_0= ruleVarBinding ) )*
            {
            // InternalMath.g:251:3: ()
            // InternalMath.g:252:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMathExpAccess().getMathExpAction_0(),
            					current);
            			

            }

            // InternalMath.g:258:3: ( (lv_variables_1_0= ruleVarBinding ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMath.g:259:4: (lv_variables_1_0= ruleVarBinding )
            	    {
            	    // InternalMath.g:259:4: (lv_variables_1_0= ruleVarBinding )
            	    // InternalMath.g:260:5: lv_variables_1_0= ruleVarBinding
            	    {

            	    					newCompositeNode(grammarAccess.getMathExpAccess().getVariablesVarBindingParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_variables_1_0=ruleVarBinding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMathExpRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_1_0,
            	    						"dk.sdu.mmmi.mdsd.Math.VarBinding");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleVarBinding"
    // InternalMath.g:281:1: entryRuleVarBinding returns [EObject current=null] : iv_ruleVarBinding= ruleVarBinding EOF ;
    public final EObject entryRuleVarBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarBinding = null;


        try {
            // InternalMath.g:281:51: (iv_ruleVarBinding= ruleVarBinding EOF )
            // InternalMath.g:282:2: iv_ruleVarBinding= ruleVarBinding EOF
            {
             newCompositeNode(grammarAccess.getVarBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarBinding=ruleVarBinding();

            state._fsp--;

             current =iv_ruleVarBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarBinding"


    // $ANTLR start "ruleVarBinding"
    // InternalMath.g:288:1: ruleVarBinding returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ) ;
    public final EObject ruleVarBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:294:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ) )
            // InternalMath.g:295:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) )
            {
            // InternalMath.g:295:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) )
            // InternalMath.g:296:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVarBindingAccess().getVarKeyword_0());
            		
            // InternalMath.g:300:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:301:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:301:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:302:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVarBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getVarBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:322:3: ( (lv_expression_3_0= ruleExp ) )
            // InternalMath.g:323:4: (lv_expression_3_0= ruleExp )
            {
            // InternalMath.g:323:4: (lv_expression_3_0= ruleExp )
            // InternalMath.g:324:5: lv_expression_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVarBindingAccess().getExpressionExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarBindingRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarBinding"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:345:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMath.g:345:44: (iv_ruleExp= ruleExp EOF )
            // InternalMath.g:346:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:352:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:358:2: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalMath.g:359:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalMath.g:359:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalMath.g:360:3: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:368:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=18 && LA6_0<=19)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMath.g:369:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalMath.g:369:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==18) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==19) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalMath.g:370:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMath.g:370:5: ( () otherlv_2= '+' )
            	            // InternalMath.g:371:6: () otherlv_2= '+'
            	            {
            	            // InternalMath.g:371:6: ()
            	            // InternalMath.g:372:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:384:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMath.g:384:5: ( () otherlv_4= '-' )
            	            // InternalMath.g:385:6: () otherlv_4= '-'
            	            {
            	            // InternalMath.g:385:6: ()
            	            // InternalMath.g:386:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,19,FOLLOW_10); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:398:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalMath.g:399:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalMath.g:399:5: (lv_right_5_0= ruleFactor )
            	    // InternalMath.g:400:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalMath.g:422:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMath.g:422:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMath.g:423:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMath.g:429:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:435:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMath.g:436:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMath.g:436:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMath.g:437:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:445:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=20 && LA8_0<=21)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMath.g:446:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:446:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==20) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==21) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalMath.g:447:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalMath.g:447:5: ( () otherlv_2= '*' )
            	            // InternalMath.g:448:6: () otherlv_2= '*'
            	            {
            	            // InternalMath.g:448:6: ()
            	            // InternalMath.g:449:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            	            						newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:461:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalMath.g:461:5: ( () otherlv_4= '/' )
            	            // InternalMath.g:462:6: () otherlv_4= '/'
            	            {
            	            // InternalMath.g:462:6: ()
            	            // InternalMath.g:463:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,21,FOLLOW_10); 

            	            						newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:475:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMath.g:476:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMath.g:476:5: (lv_right_5_0= rulePrimary )
            	    // InternalMath.g:477:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:499:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:499:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:500:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:506:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_ExternalCall_3= ruleExternalCall | this_VariableUse_4= ruleVariableUse | this_LetBinding_5= ruleLetBinding ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        EObject this_Parenthesis_2 = null;

        EObject this_ExternalCall_3 = null;

        EObject this_VariableUse_4 = null;

        EObject this_LetBinding_5 = null;



        	enterRule();

        try {
            // InternalMath.g:512:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_ExternalCall_3= ruleExternalCall | this_VariableUse_4= ruleVariableUse | this_LetBinding_5= ruleLetBinding ) )
            // InternalMath.g:513:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_ExternalCall_3= ruleExternalCall | this_VariableUse_4= ruleVariableUse | this_LetBinding_5= ruleLetBinding )
            {
            // InternalMath.g:513:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_ExternalCall_3= ruleExternalCall | this_VariableUse_4= ruleVariableUse | this_LetBinding_5= ruleLetBinding )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case 13:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==13) ) {
                    alt9=3;
                }
                else if ( (LA9_3==EOF||(LA9_3>=14 && LA9_3<=16)||(LA9_3>=18 && LA9_3<=21)||(LA9_3>=23 && LA9_3<=24)) ) {
                    alt9=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMath.g:514:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMath.g:514:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMath.g:515:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMath.g:515:4: ()
                    // InternalMath.g:516:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getMathNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMath.g:522:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMath.g:523:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMath.g:523:5: (lv_value_1_0= RULE_INT )
                    // InternalMath.g:524:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:542:3: this_Parenthesis_2= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_2=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMath.g:551:3: this_ExternalCall_3= ruleExternalCall
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getExternalCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalCall_3=ruleExternalCall();

                    state._fsp--;


                    			current = this_ExternalCall_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMath.g:560:3: this_VariableUse_4= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_4=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMath.g:569:3: this_LetBinding_5= ruleLetBinding
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetBindingParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetBinding_5=ruleLetBinding();

                    state._fsp--;


                    			current = this_LetBinding_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMath.g:581:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMath.g:581:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMath.g:582:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMath.g:588:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalMath.g:594:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) )
            // InternalMath.g:595:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            {
            // InternalMath.g:595:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            // InternalMath.g:596:3: otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMath.g:600:3: ( (lv_exp_1_0= ruleExp ) )
            // InternalMath.g:601:4: (lv_exp_1_0= ruleExp )
            {
            // InternalMath.g:601:4: (lv_exp_1_0= ruleExp )
            // InternalMath.g:602:5: lv_exp_1_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_exp_1_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleExternalCall"
    // InternalMath.g:627:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalMath.g:627:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalMath.g:628:2: iv_ruleExternalCall= ruleExternalCall EOF
            {
             newCompositeNode(grammarAccess.getExternalCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalCall=ruleExternalCall();

            state._fsp--;

             current =iv_ruleExternalCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalCall"


    // $ANTLR start "ruleExternalCall"
    // InternalMath.g:634:1: ruleExternalCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_expressions_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExp ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleExternalCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalMath.g:640:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_expressions_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExp ) ) )* )? otherlv_5= ')' ) )
            // InternalMath.g:641:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_expressions_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExp ) ) )* )? otherlv_5= ')' )
            {
            // InternalMath.g:641:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_expressions_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExp ) ) )* )? otherlv_5= ')' )
            // InternalMath.g:642:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_expressions_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExp ) ) )* )? otherlv_5= ')'
            {
            // InternalMath.g:642:3: ( (otherlv_0= RULE_ID ) )
            // InternalMath.g:643:4: (otherlv_0= RULE_ID )
            {
            // InternalMath.g:643:4: (otherlv_0= RULE_ID )
            // InternalMath.g:644:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_0, grammarAccess.getExternalCallAccess().getFunctionExternalDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMath.g:659:3: ( ( (lv_expressions_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExp ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||LA11_0==13||LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMath.g:660:4: ( (lv_expressions_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExp ) ) )*
                    {
                    // InternalMath.g:660:4: ( (lv_expressions_2_0= ruleExp ) )
                    // InternalMath.g:661:5: (lv_expressions_2_0= ruleExp )
                    {
                    // InternalMath.g:661:5: (lv_expressions_2_0= ruleExp )
                    // InternalMath.g:662:6: lv_expressions_2_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getExternalCallAccess().getExpressionsExpParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_expressions_2_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalCallRule());
                    						}
                    						add(
                    							current,
                    							"expressions",
                    							lv_expressions_2_0,
                    							"dk.sdu.mmmi.mdsd.Math.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMath.g:679:4: (otherlv_3= ',' ( (lv_expressions_4_0= ruleExp ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMath.g:680:5: otherlv_3= ',' ( (lv_expressions_4_0= ruleExp ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getExternalCallAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMath.g:684:5: ( (lv_expressions_4_0= ruleExp ) )
                    	    // InternalMath.g:685:6: (lv_expressions_4_0= ruleExp )
                    	    {
                    	    // InternalMath.g:685:6: (lv_expressions_4_0= ruleExp )
                    	    // InternalMath.g:686:7: lv_expressions_4_0= ruleExp
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalCallAccess().getExpressionsExpParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_expressions_4_0=ruleExp();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"expressions",
                    	    								lv_expressions_4_0,
                    	    								"dk.sdu.mmmi.mdsd.Math.Exp");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalCallAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalCall"


    // $ANTLR start "entryRuleLetBinding"
    // InternalMath.g:713:1: entryRuleLetBinding returns [EObject current=null] : iv_ruleLetBinding= ruleLetBinding EOF ;
    public final EObject entryRuleLetBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetBinding = null;


        try {
            // InternalMath.g:713:51: (iv_ruleLetBinding= ruleLetBinding EOF )
            // InternalMath.g:714:2: iv_ruleLetBinding= ruleLetBinding EOF
            {
             newCompositeNode(grammarAccess.getLetBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetBinding=ruleLetBinding();

            state._fsp--;

             current =iv_ruleLetBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetBinding"


    // $ANTLR start "ruleLetBinding"
    // InternalMath.g:720:1: ruleLetBinding returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) ;
    public final EObject ruleLetBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_binding_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:726:2: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) )
            // InternalMath.g:727:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            {
            // InternalMath.g:727:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            // InternalMath.g:728:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLetBindingAccess().getLetKeyword_0());
            		
            // InternalMath.g:732:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:733:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:733:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:734:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getLetBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:754:3: ( (lv_binding_3_0= ruleExp ) )
            // InternalMath.g:755:4: (lv_binding_3_0= ruleExp )
            {
            // InternalMath.g:755:4: (lv_binding_3_0= ruleExp )
            // InternalMath.g:756:5: lv_binding_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_binding_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getLetBindingAccess().getInKeyword_4());
            		
            // InternalMath.g:777:3: ( (lv_body_5_0= ruleExp ) )
            // InternalMath.g:778:4: (lv_body_5_0= ruleExp )
            {
            // InternalMath.g:778:4: (lv_body_5_0= ruleExp )
            // InternalMath.g:779:5: lv_body_5_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_body_5_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLetBindingAccess().getEndKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetBinding"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:804:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMath.g:804:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMath.g:805:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:811:1: ruleVariableUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMath.g:817:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMath.g:818:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMath.g:818:2: ( (otherlv_0= RULE_ID ) )
            // InternalMath.g:819:3: (otherlv_0= RULE_ID )
            {
            // InternalMath.g:819:3: (otherlv_0= RULE_ID )
            // InternalMath.g:820:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableUseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableUseAccess().getRefBindingCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableUse"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000402030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000040A030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});

}