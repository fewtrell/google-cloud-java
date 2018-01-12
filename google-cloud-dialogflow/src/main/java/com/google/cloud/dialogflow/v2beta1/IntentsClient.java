/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.dialogflow.v2beta1;

import static com.google.cloud.dialogflow.v2beta1.PagedResponseWrappers.ListIntentsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.v2beta1.stub.IntentsStub;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsClient;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Struct;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Manages agent intents.
 *
 * <p>Refer to the [Dialogflow documentation](https://dialogflow.com/docs/intents) for more details
 * about agent intents. #
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (IntentsClient intentsClient = IntentsClient.create()) {
 *   IntentName name = IntentName.of("[PROJECT]", "[INTENT]");
 *   Intent response = intentsClient.getIntent(name);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the intentsClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of IntentsSettings to create().
 * For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * IntentsSettings intentsSettings =
 *     IntentsSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * IntentsClient intentsClient =
 *     IntentsClient.create(intentsSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * IntentsSettings intentsSettings =
 *     IntentsSettings.newBuilder().setEndpoint(myEndpoint).build();
 * IntentsClient intentsClient =
 *     IntentsClient.create(intentsSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class IntentsClient implements BackgroundResource {
  private final IntentsSettings settings;
  private final IntentsStub stub;
  private final OperationsClient operationsClient;

  /** Constructs an instance of IntentsClient with default settings. */
  public static final IntentsClient create() throws IOException {
    return create(IntentsSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of IntentsClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final IntentsClient create(IntentsSettings settings) throws IOException {
    return new IntentsClient(settings);
  }

  /**
   * Constructs an instance of IntentsClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use IntentsSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final IntentsClient create(IntentsStub stub) {
    return new IntentsClient(stub);
  }

  /**
   * Constructs an instance of IntentsClient, using the given settings. This is protected so that it
   * is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected IntentsClient(IntentsSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected IntentsClient(IntentsStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final IntentsSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public IntentsStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final OperationsClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the list of all intents in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   ProjectAgentName parent = ProjectAgentName.of("[PROJECT]");
   *   for (Intent element : intentsClient.listIntents(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. The agent to list all intents from. Format: `projects/&lt;Project
   *     ID&gt;/agent`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListIntentsPagedResponse listIntents(ProjectAgentName parent) {
    ListIntentsRequest request =
        ListIntentsRequest.newBuilder().setParentWithProjectAgentName(parent).build();
    return listIntents(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the list of all intents in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   ProjectAgentName parent = ProjectAgentName.of("[PROJECT]");
   *   String languageCode = "";
   *   for (Intent element : intentsClient.listIntents(parent, languageCode).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. The agent to list all intents from. Format: `projects/&lt;Project
   *     ID&gt;/agent`.
   * @param languageCode Optional. The language to list training phrases, parameters and rich
   *     messages for. If not specified, the agent's default language is used. [More than a dozen
   *     languages](https://dialogflow.com/docs/reference/language) are supported. Note: languages
   *     must be enabled in the agent before they can be used.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListIntentsPagedResponse listIntents(ProjectAgentName parent, String languageCode) {
    ListIntentsRequest request =
        ListIntentsRequest.newBuilder()
            .setParentWithProjectAgentName(parent)
            .setLanguageCode(languageCode)
            .build();
    return listIntents(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the list of all intents in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   ProjectAgentName parent = ProjectAgentName.of("[PROJECT]");
   *   ListIntentsRequest request = ListIntentsRequest.newBuilder()
   *     .setParentWithProjectAgentName(parent)
   *     .build();
   *   for (Intent element : intentsClient.listIntents(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListIntentsPagedResponse listIntents(ListIntentsRequest request) {
    return listIntentsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the list of all intents in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   ProjectAgentName parent = ProjectAgentName.of("[PROJECT]");
   *   ListIntentsRequest request = ListIntentsRequest.newBuilder()
   *     .setParentWithProjectAgentName(parent)
   *     .build();
   *   ApiFuture&lt;ListIntentsPagedResponse&gt; future = intentsClient.listIntentsPagedCallable().futureCall(request);
   *   // Do something
   *   for (Intent element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListIntentsRequest, ListIntentsPagedResponse>
      listIntentsPagedCallable() {
    return stub.listIntentsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the list of all intents in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   ProjectAgentName parent = ProjectAgentName.of("[PROJECT]");
   *   ListIntentsRequest request = ListIntentsRequest.newBuilder()
   *     .setParentWithProjectAgentName(parent)
   *     .build();
   *   while (true) {
   *     ListIntentsResponse response = intentsClient.listIntentsCallable().call(request);
   *     for (Intent element : response.getIntentsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListIntentsRequest, ListIntentsResponse> listIntentsCallable() {
    return stub.listIntentsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the specified intent.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   IntentName name = IntentName.of("[PROJECT]", "[INTENT]");
   *   Intent response = intentsClient.getIntent(name);
   * }
   * </code></pre>
   *
   * @param name Required. The name of the intent. Format: `projects/&lt;Project
   *     ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent getIntent(IntentName name) {

    GetIntentRequest request = GetIntentRequest.newBuilder().setNameWithIntentName(name).build();
    return getIntent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the specified intent.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   IntentName name = IntentName.of("[PROJECT]", "[INTENT]");
   *   String languageCode = "";
   *   Intent response = intentsClient.getIntent(name, languageCode);
   * }
   * </code></pre>
   *
   * @param name Required. The name of the intent. Format: `projects/&lt;Project
   *     ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * @param languageCode Optional. The language to retrieve training phrases, parameters and rich
   *     messages for. If not specified, the agent's default language is used. [More than a dozen
   *     languages](https://dialogflow.com/docs/reference/language) are supported. Note: languages
   *     must be enabled in the agent, before they can be used.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent getIntent(IntentName name, String languageCode) {

    GetIntentRequest request =
        GetIntentRequest.newBuilder()
            .setNameWithIntentName(name)
            .setLanguageCode(languageCode)
            .build();
    return getIntent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the specified intent.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   IntentName name = IntentName.of("[PROJECT]", "[INTENT]");
   *   GetIntentRequest request = GetIntentRequest.newBuilder()
   *     .setNameWithIntentName(name)
   *     .build();
   *   Intent response = intentsClient.getIntent(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent getIntent(GetIntentRequest request) {
    return getIntentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the specified intent.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   IntentName name = IntentName.of("[PROJECT]", "[INTENT]");
   *   GetIntentRequest request = GetIntentRequest.newBuilder()
   *     .setNameWithIntentName(name)
   *     .build();
   *   ApiFuture&lt;Intent&gt; future = intentsClient.getIntentCallable().futureCall(request);
   *   // Do something
   *   Intent response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetIntentRequest, Intent> getIntentCallable() {
    return stub.getIntentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an intent in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   ProjectAgentName parent = ProjectAgentName.of("[PROJECT]");
   *   Intent intent = Intent.newBuilder().build();
   *   Intent response = intentsClient.createIntent(parent, intent);
   * }
   * </code></pre>
   *
   * @param parent Required. The agent to create a intent for. Format: `projects/&lt;Project
   *     ID&gt;/agent`.
   * @param intent Required. The intent to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent createIntent(ProjectAgentName parent, Intent intent) {

    CreateIntentRequest request =
        CreateIntentRequest.newBuilder()
            .setParentWithProjectAgentName(parent)
            .setIntent(intent)
            .build();
    return createIntent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an intent in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   ProjectAgentName parent = ProjectAgentName.of("[PROJECT]");
   *   Intent intent = Intent.newBuilder().build();
   *   String languageCode = "";
   *   Intent response = intentsClient.createIntent(parent, intent, languageCode);
   * }
   * </code></pre>
   *
   * @param parent Required. The agent to create a intent for. Format: `projects/&lt;Project
   *     ID&gt;/agent`.
   * @param intent Required. The intent to create.
   * @param languageCode Optional. The language of training phrases, parameters and rich messages
   *     defined in `intent`. If not specified, the agent's default language is used. [More than a
   *     dozen languages](https://dialogflow.com/docs/reference/language) are supported. Note:
   *     languages must be enabled in the agent, before they can be used.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent createIntent(ProjectAgentName parent, Intent intent, String languageCode) {

    CreateIntentRequest request =
        CreateIntentRequest.newBuilder()
            .setParentWithProjectAgentName(parent)
            .setIntent(intent)
            .setLanguageCode(languageCode)
            .build();
    return createIntent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an intent in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   ProjectAgentName parent = ProjectAgentName.of("[PROJECT]");
   *   Intent intent = Intent.newBuilder().build();
   *   CreateIntentRequest request = CreateIntentRequest.newBuilder()
   *     .setParentWithProjectAgentName(parent)
   *     .setIntent(intent)
   *     .build();
   *   Intent response = intentsClient.createIntent(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent createIntent(CreateIntentRequest request) {
    return createIntentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an intent in the specified agent.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   ProjectAgentName parent = ProjectAgentName.of("[PROJECT]");
   *   Intent intent = Intent.newBuilder().build();
   *   CreateIntentRequest request = CreateIntentRequest.newBuilder()
   *     .setParentWithProjectAgentName(parent)
   *     .setIntent(intent)
   *     .build();
   *   ApiFuture&lt;Intent&gt; future = intentsClient.createIntentCallable().futureCall(request);
   *   // Do something
   *   Intent response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateIntentRequest, Intent> createIntentCallable() {
    return stub.createIntentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified intent.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   Intent intent = Intent.newBuilder().build();
   *   String languageCode = "";
   *   Intent response = intentsClient.updateIntent(intent, languageCode);
   * }
   * </code></pre>
   *
   * @param intent Required. The intent to update. Format: `projects/&lt;Project
   *     ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * @param languageCode Optional. The language of training phrases, parameters and rich messages
   *     defined in `intent`. If not specified, the agent's default language is used. [More than a
   *     dozen languages](https://dialogflow.com/docs/reference/language) are supported. Note:
   *     languages must be enabled in the agent, before they can be used.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent updateIntent(Intent intent, String languageCode) {

    UpdateIntentRequest request =
        UpdateIntentRequest.newBuilder().setIntent(intent).setLanguageCode(languageCode).build();
    return updateIntent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified intent.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   Intent intent = Intent.newBuilder().build();
   *   String languageCode = "";
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Intent response = intentsClient.updateIntent(intent, languageCode, updateMask);
   * }
   * </code></pre>
   *
   * @param intent Required. The intent to update. Format: `projects/&lt;Project
   *     ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * @param languageCode Optional. The language of training phrases, parameters and rich messages
   *     defined in `intent`. If not specified, the agent's default language is used. [More than a
   *     dozen languages](https://dialogflow.com/docs/reference/language) are supported. Note:
   *     languages must be enabled in the agent, before they can be used.
   * @param updateMask Optional. The mask to control which fields get updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent updateIntent(Intent intent, String languageCode, FieldMask updateMask) {

    UpdateIntentRequest request =
        UpdateIntentRequest.newBuilder()
            .setIntent(intent)
            .setLanguageCode(languageCode)
            .setUpdateMask(updateMask)
            .build();
    return updateIntent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified intent.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   Intent intent = Intent.newBuilder().build();
   *   String languageCode = "";
   *   UpdateIntentRequest request = UpdateIntentRequest.newBuilder()
   *     .setIntent(intent)
   *     .setLanguageCode(languageCode)
   *     .build();
   *   Intent response = intentsClient.updateIntent(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Intent updateIntent(UpdateIntentRequest request) {
    return updateIntentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the specified intent.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   Intent intent = Intent.newBuilder().build();
   *   String languageCode = "";
   *   UpdateIntentRequest request = UpdateIntentRequest.newBuilder()
   *     .setIntent(intent)
   *     .setLanguageCode(languageCode)
   *     .build();
   *   ApiFuture&lt;Intent&gt; future = intentsClient.updateIntentCallable().futureCall(request);
   *   // Do something
   *   Intent response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateIntentRequest, Intent> updateIntentCallable() {
    return stub.updateIntentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified intent.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   IntentName name = IntentName.of("[PROJECT]", "[INTENT]");
   *   intentsClient.deleteIntent(name);
   * }
   * </code></pre>
   *
   * @param name Required. The name of the intent to delete. Format: `projects/&lt;Project
   *     ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteIntent(IntentName name) {

    DeleteIntentRequest request =
        DeleteIntentRequest.newBuilder().setNameWithIntentName(name).build();
    deleteIntent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified intent.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   IntentName name = IntentName.of("[PROJECT]", "[INTENT]");
   *   DeleteIntentRequest request = DeleteIntentRequest.newBuilder()
   *     .setNameWithIntentName(name)
   *     .build();
   *   intentsClient.deleteIntent(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final void deleteIntent(DeleteIntentRequest request) {
    deleteIntentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified intent.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   IntentName name = IntentName.of("[PROJECT]", "[INTENT]");
   *   DeleteIntentRequest request = DeleteIntentRequest.newBuilder()
   *     .setNameWithIntentName(name)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = intentsClient.deleteIntentCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteIntentRequest, Empty> deleteIntentCallable() {
    return stub.deleteIntentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates/Creates multiple intents in the specified agent.
   *
   * <p>Operation &lt;response:
   * [BatchUpdateIntentsResponse][google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse]&gt;
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   AgentName parent = AgentName.of("[PROJECT]", "[AGENT]");
   *   String languageCode = "";
   *   BatchUpdateIntentsRequest request = BatchUpdateIntentsRequest.newBuilder()
   *     .setParentWithAgentName(parent)
   *     .setLanguageCode(languageCode)
   *     .build();
   *   BatchUpdateIntentsResponse response = intentsClient.batchUpdateIntentsAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<BatchUpdateIntentsResponse, Struct> batchUpdateIntentsAsync(
      BatchUpdateIntentsRequest request) {
    return batchUpdateIntentsOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates/Creates multiple intents in the specified agent.
   *
   * <p>Operation &lt;response:
   * [BatchUpdateIntentsResponse][google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse]&gt;
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   AgentName parent = AgentName.of("[PROJECT]", "[AGENT]");
   *   String languageCode = "";
   *   BatchUpdateIntentsRequest request = BatchUpdateIntentsRequest.newBuilder()
   *     .setParentWithAgentName(parent)
   *     .setLanguageCode(languageCode)
   *     .build();
   *   OperationFuture&lt;Operation&gt; future = intentsClient.batchUpdateIntentsOperationCallable().futureCall(request);
   *   // Do something
   *   BatchUpdateIntentsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final OperationCallable<BatchUpdateIntentsRequest, BatchUpdateIntentsResponse, Struct>
      batchUpdateIntentsOperationCallable() {
    return stub.batchUpdateIntentsOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates/Creates multiple intents in the specified agent.
   *
   * <p>Operation &lt;response:
   * [BatchUpdateIntentsResponse][google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse]&gt;
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   AgentName parent = AgentName.of("[PROJECT]", "[AGENT]");
   *   String languageCode = "";
   *   BatchUpdateIntentsRequest request = BatchUpdateIntentsRequest.newBuilder()
   *     .setParentWithAgentName(parent)
   *     .setLanguageCode(languageCode)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = intentsClient.batchUpdateIntentsCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<BatchUpdateIntentsRequest, Operation> batchUpdateIntentsCallable() {
    return stub.batchUpdateIntentsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes intents in the specified agent.
   *
   * <p>Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   List&lt;Intent&gt; intents = new ArrayList&lt;&gt;();
   *   Empty response = intentsClient.batchDeleteIntentsAsync(parent, intents).get();
   * }
   * </code></pre>
   *
   * @param parent Required. The name of the agent to delete all entities types for. Format:
   *     `projects/&lt;Project ID&gt;/agent`.
   * @param intents Required. The collection of intents to delete. Only intent `name` must be filled
   *     in.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, Struct> batchDeleteIntentsAsync(
      ProjectName parent, List<Intent> intents) {

    BatchDeleteIntentsRequest request =
        BatchDeleteIntentsRequest.newBuilder()
            .setParentWithProjectName(parent)
            .addAllIntents(intents)
            .build();
    return batchDeleteIntentsAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes intents in the specified agent.
   *
   * <p>Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   List&lt;Intent&gt; intents = new ArrayList&lt;&gt;();
   *   BatchDeleteIntentsRequest request = BatchDeleteIntentsRequest.newBuilder()
   *     .setParentWithProjectName(parent)
   *     .addAllIntents(intents)
   *     .build();
   *   Empty response = intentsClient.batchDeleteIntentsAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, Struct> batchDeleteIntentsAsync(
      BatchDeleteIntentsRequest request) {
    return batchDeleteIntentsOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes intents in the specified agent.
   *
   * <p>Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   List&lt;Intent&gt; intents = new ArrayList&lt;&gt;();
   *   BatchDeleteIntentsRequest request = BatchDeleteIntentsRequest.newBuilder()
   *     .setParentWithProjectName(parent)
   *     .addAllIntents(intents)
   *     .build();
   *   OperationFuture&lt;Operation&gt; future = intentsClient.batchDeleteIntentsOperationCallable().futureCall(request);
   *   // Do something
   *   Empty response = future.get();
   * }
   * </code></pre>
   */
  public final OperationCallable<BatchDeleteIntentsRequest, Empty, Struct>
      batchDeleteIntentsOperationCallable() {
    return stub.batchDeleteIntentsOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes intents in the specified agent.
   *
   * <p>Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IntentsClient intentsClient = IntentsClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   List&lt;Intent&gt; intents = new ArrayList&lt;&gt;();
   *   BatchDeleteIntentsRequest request = BatchDeleteIntentsRequest.newBuilder()
   *     .setParentWithProjectName(parent)
   *     .addAllIntents(intents)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = intentsClient.batchDeleteIntentsCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<BatchDeleteIntentsRequest, Operation> batchDeleteIntentsCallable() {
    return stub.batchDeleteIntentsCallable();
  }

  @Override
  public final void close() throws Exception {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
