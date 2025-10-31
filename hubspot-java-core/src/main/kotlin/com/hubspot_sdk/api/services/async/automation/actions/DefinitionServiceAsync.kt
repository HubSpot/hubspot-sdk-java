// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation.actions

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.automation.actions.PublicActionDefinition
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionCreateParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionDeleteParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionGetParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionListPageAsync
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionListParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DefinitionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DefinitionServiceAsync

    /** Create a new custom workflow action. */
    fun create(
        appId: Int,
        params: DefinitionCreateParams,
    ): CompletableFuture<PublicActionDefinition> = create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: DefinitionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionDefinition> =
        create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(params: DefinitionCreateParams): CompletableFuture<PublicActionDefinition> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DefinitionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionDefinition>

    /** Update an existing action definition by ID. */
    fun update(
        definitionId: String,
        params: DefinitionUpdateParams,
    ): CompletableFuture<PublicActionDefinition> =
        update(definitionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        definitionId: String,
        params: DefinitionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionDefinition> =
        update(params.toBuilder().definitionId(definitionId).build(), requestOptions)

    /** @see update */
    fun update(params: DefinitionUpdateParams): CompletableFuture<PublicActionDefinition> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DefinitionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionDefinition>

    /** Retrieve custom workflow action definitions by app ID. */
    fun list(appId: Int): CompletableFuture<DefinitionListPageAsync> =
        list(appId, DefinitionListParams.none())

    /** @see list */
    fun list(
        appId: Int,
        params: DefinitionListParams = DefinitionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DefinitionListPageAsync> =
        list(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see list */
    fun list(
        appId: Int,
        params: DefinitionListParams = DefinitionListParams.none(),
    ): CompletableFuture<DefinitionListPageAsync> = list(appId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DefinitionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DefinitionListPageAsync>

    /** @see list */
    fun list(params: DefinitionListParams): CompletableFuture<DefinitionListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<DefinitionListPageAsync> =
        list(appId, DefinitionListParams.none(), requestOptions)

    /** Delete an action definition by ID. */
    fun delete(definitionId: String, params: DefinitionDeleteParams): CompletableFuture<Void?> =
        delete(definitionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        definitionId: String,
        params: DefinitionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().definitionId(definitionId).build(), requestOptions)

    /** @see delete */
    fun delete(params: DefinitionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DefinitionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Retrieve a custom workflow action definition by ID. */
    fun get(
        definitionId: String,
        params: DefinitionGetParams,
    ): CompletableFuture<PublicActionDefinition> = get(definitionId, params, RequestOptions.none())

    /** @see get */
    fun get(
        definitionId: String,
        params: DefinitionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionDefinition> =
        get(params.toBuilder().definitionId(definitionId).build(), requestOptions)

    /** @see get */
    fun get(params: DefinitionGetParams): CompletableFuture<PublicActionDefinition> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DefinitionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionDefinition>

    /**
     * A view of [DefinitionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DefinitionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /automation/v4/actions/{appId}`, but is otherwise
         * the same as [DefinitionServiceAsync.create].
         */
        fun create(
            appId: Int,
            params: DefinitionCreateParams,
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>> =
            create(appId, params, RequestOptions.none())

        /** @see create */
        fun create(
            appId: Int,
            params: DefinitionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        fun create(
            params: DefinitionCreateParams
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DefinitionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>>

        /**
         * Returns a raw HTTP response for `patch /automation/v4/actions/{appId}/{definitionId}`,
         * but is otherwise the same as [DefinitionServiceAsync.update].
         */
        fun update(
            definitionId: String,
            params: DefinitionUpdateParams,
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>> =
            update(definitionId, params, RequestOptions.none())

        /** @see update */
        fun update(
            definitionId: String,
            params: DefinitionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>> =
            update(params.toBuilder().definitionId(definitionId).build(), requestOptions)

        /** @see update */
        fun update(
            params: DefinitionUpdateParams
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DefinitionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>>

        /**
         * Returns a raw HTTP response for `get /automation/v4/actions/{appId}`, but is otherwise
         * the same as [DefinitionServiceAsync.list].
         */
        fun list(appId: Int): CompletableFuture<HttpResponseFor<DefinitionListPageAsync>> =
            list(appId, DefinitionListParams.none())

        /** @see list */
        fun list(
            appId: Int,
            params: DefinitionListParams = DefinitionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DefinitionListPageAsync>> =
            list(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see list */
        fun list(
            appId: Int,
            params: DefinitionListParams = DefinitionListParams.none(),
        ): CompletableFuture<HttpResponseFor<DefinitionListPageAsync>> =
            list(appId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: DefinitionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DefinitionListPageAsync>>

        /** @see list */
        fun list(
            params: DefinitionListParams
        ): CompletableFuture<HttpResponseFor<DefinitionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DefinitionListPageAsync>> =
            list(appId, DefinitionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /automation/v4/actions/{appId}/{definitionId}`,
         * but is otherwise the same as [DefinitionServiceAsync.delete].
         */
        fun delete(
            definitionId: String,
            params: DefinitionDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(definitionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            definitionId: String,
            params: DefinitionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().definitionId(definitionId).build(), requestOptions)

        /** @see delete */
        fun delete(params: DefinitionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DefinitionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /automation/v4/actions/{appId}/{definitionId}`, but
         * is otherwise the same as [DefinitionServiceAsync.get].
         */
        fun get(
            definitionId: String,
            params: DefinitionGetParams,
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>> =
            get(definitionId, params, RequestOptions.none())

        /** @see get */
        fun get(
            definitionId: String,
            params: DefinitionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>> =
            get(params.toBuilder().definitionId(definitionId).build(), requestOptions)

        /** @see get */
        fun get(
            params: DefinitionGetParams
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: DefinitionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>>
    }
}
