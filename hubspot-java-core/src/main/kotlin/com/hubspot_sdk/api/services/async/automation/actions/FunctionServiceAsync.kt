// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation.actions

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.automation.actions.CollectionResponsePublicActionFunctionIdentifierNoPaging
import com.hubspot_sdk.api.models.automation.actions.PublicActionFunction
import com.hubspot_sdk.api.models.automation.actions.PublicActionFunctionIdentifier
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionCreateOrReplaceByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionCreateOrReplaceParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionDeleteByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionDeleteParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionGetByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionGetParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FunctionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FunctionServiceAsync

    /** Retrieve all functions included in a definition. */
    fun list(
        definitionId: String,
        params: FunctionListParams,
    ): CompletableFuture<CollectionResponsePublicActionFunctionIdentifierNoPaging> =
        list(definitionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        definitionId: String,
        params: FunctionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicActionFunctionIdentifierNoPaging> =
        list(params.toBuilder().definitionId(definitionId).build(), requestOptions)

    /** @see list */
    fun list(
        params: FunctionListParams
    ): CompletableFuture<CollectionResponsePublicActionFunctionIdentifierNoPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FunctionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicActionFunctionIdentifierNoPaging>

    /** Archive a function for a specific definition. */
    fun delete(functionId: String, params: FunctionDeleteParams): CompletableFuture<Void?> =
        delete(functionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        functionId: String,
        params: FunctionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see delete */
    fun delete(params: FunctionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FunctionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Update a function for a given definition by ID. */
    fun createOrReplace(
        functionId: String,
        params: FunctionCreateOrReplaceParams,
    ): CompletableFuture<PublicActionFunctionIdentifier> =
        createOrReplace(functionId, params, RequestOptions.none())

    /** @see createOrReplace */
    fun createOrReplace(
        functionId: String,
        params: FunctionCreateOrReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionFunctionIdentifier> =
        createOrReplace(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see createOrReplace */
    fun createOrReplace(
        params: FunctionCreateOrReplaceParams
    ): CompletableFuture<PublicActionFunctionIdentifier> =
        createOrReplace(params, RequestOptions.none())

    /** @see createOrReplace */
    fun createOrReplace(
        params: FunctionCreateOrReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionFunctionIdentifier>

    /** Add a function for a given definition. */
    fun createOrReplaceByFunctionType(
        functionType: FunctionCreateOrReplaceByFunctionTypeParams.FunctionType,
        params: FunctionCreateOrReplaceByFunctionTypeParams,
    ): CompletableFuture<PublicActionFunctionIdentifier> =
        createOrReplaceByFunctionType(functionType, params, RequestOptions.none())

    /** @see createOrReplaceByFunctionType */
    fun createOrReplaceByFunctionType(
        functionType: FunctionCreateOrReplaceByFunctionTypeParams.FunctionType,
        params: FunctionCreateOrReplaceByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionFunctionIdentifier> =
        createOrReplaceByFunctionType(
            params.toBuilder().functionType(functionType).build(),
            requestOptions,
        )

    /** @see createOrReplaceByFunctionType */
    fun createOrReplaceByFunctionType(
        params: FunctionCreateOrReplaceByFunctionTypeParams
    ): CompletableFuture<PublicActionFunctionIdentifier> =
        createOrReplaceByFunctionType(params, RequestOptions.none())

    /** @see createOrReplaceByFunctionType */
    fun createOrReplaceByFunctionType(
        params: FunctionCreateOrReplaceByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionFunctionIdentifier>

    /** Delete a function within a given definition. */
    fun deleteByFunctionType(
        functionType: FunctionDeleteByFunctionTypeParams.FunctionType,
        params: FunctionDeleteByFunctionTypeParams,
    ): CompletableFuture<Void?> = deleteByFunctionType(functionType, params, RequestOptions.none())

    /** @see deleteByFunctionType */
    fun deleteByFunctionType(
        functionType: FunctionDeleteByFunctionTypeParams.FunctionType,
        params: FunctionDeleteByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteByFunctionType(params.toBuilder().functionType(functionType).build(), requestOptions)

    /** @see deleteByFunctionType */
    fun deleteByFunctionType(params: FunctionDeleteByFunctionTypeParams): CompletableFuture<Void?> =
        deleteByFunctionType(params, RequestOptions.none())

    /** @see deleteByFunctionType */
    fun deleteByFunctionType(
        params: FunctionDeleteByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Retrieve a specific function from a given definition. */
    fun get(
        functionId: String,
        params: FunctionGetParams,
    ): CompletableFuture<PublicActionFunction> = get(functionId, params, RequestOptions.none())

    /** @see get */
    fun get(
        functionId: String,
        params: FunctionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionFunction> =
        get(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see get */
    fun get(params: FunctionGetParams): CompletableFuture<PublicActionFunction> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FunctionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionFunction>

    /** Retrieve functions of a specific type for a given definition. */
    fun getByFunctionType(
        functionType: FunctionGetByFunctionTypeParams.FunctionType,
        params: FunctionGetByFunctionTypeParams,
    ): CompletableFuture<PublicActionFunction> =
        getByFunctionType(functionType, params, RequestOptions.none())

    /** @see getByFunctionType */
    fun getByFunctionType(
        functionType: FunctionGetByFunctionTypeParams.FunctionType,
        params: FunctionGetByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionFunction> =
        getByFunctionType(params.toBuilder().functionType(functionType).build(), requestOptions)

    /** @see getByFunctionType */
    fun getByFunctionType(
        params: FunctionGetByFunctionTypeParams
    ): CompletableFuture<PublicActionFunction> = getByFunctionType(params, RequestOptions.none())

    /** @see getByFunctionType */
    fun getByFunctionType(
        params: FunctionGetByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionFunction>

    /**
     * A view of [FunctionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FunctionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /automation/actions/2026-03/{appId}/{definitionId}/functions`, but is otherwise the same
         * as [FunctionServiceAsync.list].
         */
        fun list(
            definitionId: String,
            params: FunctionListParams,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicActionFunctionIdentifierNoPaging>
        > = list(definitionId, params, RequestOptions.none())

        /** @see list */
        fun list(
            definitionId: String,
            params: FunctionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicActionFunctionIdentifierNoPaging>
        > = list(params.toBuilder().definitionId(definitionId).build(), requestOptions)

        /** @see list */
        fun list(
            params: FunctionListParams
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicActionFunctionIdentifierNoPaging>
        > = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: FunctionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicActionFunctionIdentifierNoPaging>
        >

        /**
         * Returns a raw HTTP response for `delete
         * /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}/{functionId}`,
         * but is otherwise the same as [FunctionServiceAsync.delete].
         */
        fun delete(
            functionId: String,
            params: FunctionDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(functionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            functionId: String,
            params: FunctionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see delete */
        fun delete(params: FunctionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FunctionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put
         * /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}/{functionId}`,
         * but is otherwise the same as [FunctionServiceAsync.createOrReplace].
         */
        fun createOrReplace(
            functionId: String,
            params: FunctionCreateOrReplaceParams,
        ): CompletableFuture<HttpResponseFor<PublicActionFunctionIdentifier>> =
            createOrReplace(functionId, params, RequestOptions.none())

        /** @see createOrReplace */
        fun createOrReplace(
            functionId: String,
            params: FunctionCreateOrReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionFunctionIdentifier>> =
            createOrReplace(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see createOrReplace */
        fun createOrReplace(
            params: FunctionCreateOrReplaceParams
        ): CompletableFuture<HttpResponseFor<PublicActionFunctionIdentifier>> =
            createOrReplace(params, RequestOptions.none())

        /** @see createOrReplace */
        fun createOrReplace(
            params: FunctionCreateOrReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionFunctionIdentifier>>

        /**
         * Returns a raw HTTP response for `put
         * /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}`, but is
         * otherwise the same as [FunctionServiceAsync.createOrReplaceByFunctionType].
         */
        fun createOrReplaceByFunctionType(
            functionType: FunctionCreateOrReplaceByFunctionTypeParams.FunctionType,
            params: FunctionCreateOrReplaceByFunctionTypeParams,
        ): CompletableFuture<HttpResponseFor<PublicActionFunctionIdentifier>> =
            createOrReplaceByFunctionType(functionType, params, RequestOptions.none())

        /** @see createOrReplaceByFunctionType */
        fun createOrReplaceByFunctionType(
            functionType: FunctionCreateOrReplaceByFunctionTypeParams.FunctionType,
            params: FunctionCreateOrReplaceByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionFunctionIdentifier>> =
            createOrReplaceByFunctionType(
                params.toBuilder().functionType(functionType).build(),
                requestOptions,
            )

        /** @see createOrReplaceByFunctionType */
        fun createOrReplaceByFunctionType(
            params: FunctionCreateOrReplaceByFunctionTypeParams
        ): CompletableFuture<HttpResponseFor<PublicActionFunctionIdentifier>> =
            createOrReplaceByFunctionType(params, RequestOptions.none())

        /** @see createOrReplaceByFunctionType */
        fun createOrReplaceByFunctionType(
            params: FunctionCreateOrReplaceByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionFunctionIdentifier>>

        /**
         * Returns a raw HTTP response for `delete
         * /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}`, but is
         * otherwise the same as [FunctionServiceAsync.deleteByFunctionType].
         */
        fun deleteByFunctionType(
            functionType: FunctionDeleteByFunctionTypeParams.FunctionType,
            params: FunctionDeleteByFunctionTypeParams,
        ): CompletableFuture<HttpResponse> =
            deleteByFunctionType(functionType, params, RequestOptions.none())

        /** @see deleteByFunctionType */
        fun deleteByFunctionType(
            functionType: FunctionDeleteByFunctionTypeParams.FunctionType,
            params: FunctionDeleteByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteByFunctionType(
                params.toBuilder().functionType(functionType).build(),
                requestOptions,
            )

        /** @see deleteByFunctionType */
        fun deleteByFunctionType(
            params: FunctionDeleteByFunctionTypeParams
        ): CompletableFuture<HttpResponse> = deleteByFunctionType(params, RequestOptions.none())

        /** @see deleteByFunctionType */
        fun deleteByFunctionType(
            params: FunctionDeleteByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}/{functionId}`,
         * but is otherwise the same as [FunctionServiceAsync.get].
         */
        fun get(
            functionId: String,
            params: FunctionGetParams,
        ): CompletableFuture<HttpResponseFor<PublicActionFunction>> =
            get(functionId, params, RequestOptions.none())

        /** @see get */
        fun get(
            functionId: String,
            params: FunctionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionFunction>> =
            get(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see get */
        fun get(
            params: FunctionGetParams
        ): CompletableFuture<HttpResponseFor<PublicActionFunction>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: FunctionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionFunction>>

        /**
         * Returns a raw HTTP response for `get
         * /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}`, but is
         * otherwise the same as [FunctionServiceAsync.getByFunctionType].
         */
        fun getByFunctionType(
            functionType: FunctionGetByFunctionTypeParams.FunctionType,
            params: FunctionGetByFunctionTypeParams,
        ): CompletableFuture<HttpResponseFor<PublicActionFunction>> =
            getByFunctionType(functionType, params, RequestOptions.none())

        /** @see getByFunctionType */
        fun getByFunctionType(
            functionType: FunctionGetByFunctionTypeParams.FunctionType,
            params: FunctionGetByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionFunction>> =
            getByFunctionType(params.toBuilder().functionType(functionType).build(), requestOptions)

        /** @see getByFunctionType */
        fun getByFunctionType(
            params: FunctionGetByFunctionTypeParams
        ): CompletableFuture<HttpResponseFor<PublicActionFunction>> =
            getByFunctionType(params, RequestOptions.none())

        /** @see getByFunctionType */
        fun getByFunctionType(
            params: FunctionGetByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionFunction>>
    }
}
