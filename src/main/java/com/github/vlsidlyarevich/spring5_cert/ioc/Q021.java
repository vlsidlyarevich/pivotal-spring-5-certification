package com.github.vlsidlyarevich.spring5_cert.ioc;

/**
 * <b>How do you configure profiles? What are possible use cases where they might be useful?</b>
 * <br><br>
 * Bean definition profiles provide a mechanism in the core container that allows for registration of different beans in different environments.
 * The word, “environment,” can mean different things to different users, and this feature can help with many use cases, including:
 * <ul>
 * <li>Working against an in-memory datasource in development versus looking up that same datasource from JNDI when in QA or production.</li>
 * <li>Registering monitoring infrastructure only when deploying an application into a performance environment.</li>
 * <li>Registering customized implementations of beans for customer A versus customer B deployments.</li>
 * </ul>
 * <p>
 * The {@code @Profile} annotation lets you indicate that a component is eligible for registration when one
 * or more specified profiles are active.<br>
 * The profile string may contain a simple profile name (for example, production) or a profile expression.
 * A profile expression allows for more complicated profile logic to be expressed (for example, production & us-east).
 * The following operators are supported in profile expressions:
 * <ul>
 *     <li>!: A logical “not” of the profile</li>
 *     <li>&: A logical “and” of the profiles</li>
 *     <li>|: A logical “or” of the profiles</li>
 * </ul>
 *
 * @author vlsidlyarevich
 */
public class Q021 {
}
