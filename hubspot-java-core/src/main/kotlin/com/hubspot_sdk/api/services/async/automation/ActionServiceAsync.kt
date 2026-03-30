// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.automation.actions.ActionCompleteBatchParams
import com.hubspot_sdk.api.models.automation.actions.ActionCompleteParams
import com.hubspot_sdk.api.models.automation.actions.ActionCreateOrReplaceByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.ActionCreateOrReplaceParams
import com.hubspot_sdk.api.models.automation.actions.ActionCreateParams
import com.hubspot_sdk.api.models.automation.actions.ActionCreateRequiresObjectParams
import com.hubspot_sdk.api.models.automation.actions.ActionDeleteByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.ActionDeleteParams
import com.hubspot_sdk.api.models.automation.actions.ActionGetByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.ActionGetParams
import com.hubspot_sdk.api.models.automation.actions.ActionGetRequiresObjectParams
import com.hubspot_sdk.api.models.automation.actions.ActionListPageAsync
import com.hubspot_sdk.api.models.automation.actions.ActionListParams
import com.hubspot_sdk.api.models.automation.actions.ActionUpdateParams
import com.hubspot_sdk.api.models.automation.actions.BatchInputCallbackCompletionBatchRequest
import com.hubspot_sdk.api.models.automation.actions.PublicActionDefinition
import com.hubspot_sdk.api.models.automation.actions.PublicActionDefinitionRequiresObjectResponse
import com.hubspot_sdk.api.models.automation.actions.PublicActionFunction
import com.hubspot_sdk.api.models.automation.actions.PublicActionFunctionIdentifier
import com.hubspot_sdk.api.models.automation.actions.PublicActionRevision
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ActionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync

    /** Create a new custom workflow action. */
    fun create(appId: Int, params: ActionCreateParams): CompletableFuture<PublicActionDefinition> =
        create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: ActionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionDefinition> =
        create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(params: ActionCreateParams): CompletableFuture<PublicActionDefinition> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ActionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionDefinition>

    /** Update an existing action definition by ID. */
    fun update(
        definitionId: String,
        params: ActionUpdateParams,
    ): CompletableFuture<PublicActionDefinition> =
        update(definitionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        definitionId: String,
        params: ActionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionDefinition> =
        update(params.toBuilder().definitionId(definitionId).build(), requestOptions)

    /** @see update */
    fun update(params: ActionUpdateParams): CompletableFuture<PublicActionDefinition> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ActionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionDefinition>

    /** Retrieve the versions of a definition by ID. */
    fun list(
        definitionId: String,
        params: ActionListParams,
    ): CompletableFuture<ActionListPageAsync> = list(definitionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        definitionId: String,
        params: ActionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionListPageAsync> =
        list(params.toBuilder().definitionId(definitionId).build(), requestOptions)

    /** @see list */
    fun list(params: ActionListParams): CompletableFuture<ActionListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ActionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionListPageAsync>

    /** Archive a function for a specific definition. */
    fun delete(functionId: String, params: ActionDeleteParams): CompletableFuture<Void?> =
        delete(functionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        functionId: String,
        params: ActionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ActionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ActionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Complete a specific blocked action execution by ID. */
    fun complete(callbackId: String, params: ActionCompleteParams): CompletableFuture<Void?> =
        complete(callbackId, params, RequestOptions.none())

    /** @see complete */
    fun complete(
        callbackId: String,
        params: ActionCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        complete(params.toBuilder().callbackId(callbackId).build(), requestOptions)

    /** @see complete */
    fun complete(params: ActionCompleteParams): CompletableFuture<Void?> =
        complete(params, RequestOptions.none())

    /** @see complete */
    fun complete(
        params: ActionCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Complete a batch of blocked action executions. */
    fun completeBatch(params: ActionCompleteBatchParams): CompletableFuture<Void?> =
        completeBatch(params, RequestOptions.none())

    /** @see completeBatch */
    fun completeBatch(
        params: ActionCompleteBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see completeBatch */
    fun completeBatch(
        batchInputCallbackCompletionBatchRequest: BatchInputCallbackCompletionBatchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        completeBatch(
            ActionCompleteBatchParams.builder()
                .batchInputCallbackCompletionBatchRequest(batchInputCallbackCompletionBatchRequest)
                .build(),
            requestOptions,
        )

    /** @see completeBatch */
    fun completeBatch(
        batchInputCallbackCompletionBatchRequest: BatchInputCallbackCompletionBatchRequest
    ): CompletableFuture<Void?> =
        completeBatch(batchInputCallbackCompletionBatchRequest, RequestOptions.none())

    /** Update a function for a given definition by ID. */
    fun createOrReplace(
        functionId: String,
        params: ActionCreateOrReplaceParams,
    ): CompletableFuture<PublicActionFunctionIdentifier> =
        createOrReplace(functionId, params, RequestOptions.none())

    /** @see createOrReplace */
    fun createOrReplace(
        functionId: String,
        params: ActionCreateOrReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionFunctionIdentifier> =
        createOrReplace(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see createOrReplace */
    fun createOrReplace(
        params: ActionCreateOrReplaceParams
    ): CompletableFuture<PublicActionFunctionIdentifier> =
        createOrReplace(params, RequestOptions.none())

    /** @see createOrReplace */
    fun createOrReplace(
        params: ActionCreateOrReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionFunctionIdentifier>

    /** Add a function for a given definition. */
    fun createOrReplaceByFunctionType(
        functionType: ActionCreateOrReplaceByFunctionTypeParams.FunctionType,
        params: ActionCreateOrReplaceByFunctionTypeParams,
    ): CompletableFuture<PublicActionFunctionIdentifier> =
        createOrReplaceByFunctionType(functionType, params, RequestOptions.none())

    /** @see createOrReplaceByFunctionType */
    fun createOrReplaceByFunctionType(
        functionType: ActionCreateOrReplaceByFunctionTypeParams.FunctionType,
        params: ActionCreateOrReplaceByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionFunctionIdentifier> =
        createOrReplaceByFunctionType(
            params.toBuilder().functionType(functionType).build(),
            requestOptions,
        )

    /** @see createOrReplaceByFunctionType */
    fun createOrReplaceByFunctionType(
        params: ActionCreateOrReplaceByFunctionTypeParams
    ): CompletableFuture<PublicActionFunctionIdentifier> =
        createOrReplaceByFunctionType(params, RequestOptions.none())

    /** @see createOrReplaceByFunctionType */
    fun createOrReplaceByFunctionType(
        params: ActionCreateOrReplaceByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionFunctionIdentifier>

    /** Set whether a custom action definition requires an object. */
    fun createRequiresObject(
        definitionId: String,
        params: ActionCreateRequiresObjectParams,
    ): CompletableFuture<Void?> = createRequiresObject(definitionId, params, RequestOptions.none())

    /** @see createRequiresObject */
    fun createRequiresObject(
        definitionId: String,
        params: ActionCreateRequiresObjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        createRequiresObject(params.toBuilder().definitionId(definitionId).build(), requestOptions)

    /** @see createRequiresObject */
    fun createRequiresObject(params: ActionCreateRequiresObjectParams): CompletableFuture<Void?> =
        createRequiresObject(params, RequestOptions.none())

    /** @see createRequiresObject */
    fun createRequiresObject(
        params: ActionCreateRequiresObjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Delete a function within a given definition. */
    fun deleteByFunctionType(
        functionType: ActionDeleteByFunctionTypeParams.FunctionType,
        params: ActionDeleteByFunctionTypeParams,
    ): CompletableFuture<Void?> = deleteByFunctionType(functionType, params, RequestOptions.none())

    /** @see deleteByFunctionType */
    fun deleteByFunctionType(
        functionType: ActionDeleteByFunctionTypeParams.FunctionType,
        params: ActionDeleteByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteByFunctionType(params.toBuilder().functionType(functionType).build(), requestOptions)

    /** @see deleteByFunctionType */
    fun deleteByFunctionType(params: ActionDeleteByFunctionTypeParams): CompletableFuture<Void?> =
        deleteByFunctionType(params, RequestOptions.none())

    /** @see deleteByFunctionType */
    fun deleteByFunctionType(
        params: ActionDeleteByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Retrieve a specific revision of a definition by revision ID. */
    fun get(revisionId: String, params: ActionGetParams): CompletableFuture<PublicActionRevision> =
        get(revisionId, params, RequestOptions.none())

    /** @see get */
    fun get(
        revisionId: String,
        params: ActionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionRevision> =
        get(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see get */
    fun get(params: ActionGetParams): CompletableFuture<PublicActionRevision> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ActionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionRevision>

    /** Retrieve functions of a specific type for a given definition. */
    fun getByFunctionType(
        functionType: ActionGetByFunctionTypeParams.FunctionType,
        params: ActionGetByFunctionTypeParams,
    ): CompletableFuture<PublicActionFunction> =
        getByFunctionType(functionType, params, RequestOptions.none())

    /** @see getByFunctionType */
    fun getByFunctionType(
        functionType: ActionGetByFunctionTypeParams.FunctionType,
        params: ActionGetByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionFunction> =
        getByFunctionType(params.toBuilder().functionType(functionType).build(), requestOptions)

    /** @see getByFunctionType */
    fun getByFunctionType(
        params: ActionGetByFunctionTypeParams
    ): CompletableFuture<PublicActionFunction> = getByFunctionType(params, RequestOptions.none())

    /** @see getByFunctionType */
    fun getByFunctionType(
        params: ActionGetByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionFunction>

    /** Retrieve whether a custom action definition requires an object. */
    fun getRequiresObject(
        definitionId: String,
        params: ActionGetRequiresObjectParams,
    ): CompletableFuture<PublicActionDefinitionRequiresObjectResponse> =
        getRequiresObject(definitionId, params, RequestOptions.none())

    /** @see getRequiresObject */
    fun getRequiresObject(
        definitionId: String,
        params: ActionGetRequiresObjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionDefinitionRequiresObjectResponse> =
        getRequiresObject(params.toBuilder().definitionId(definitionId).build(), requestOptions)

    /** @see getRequiresObject */
    fun getRequiresObject(
        params: ActionGetRequiresObjectParams
    ): CompletableFuture<PublicActionDefinitionRequiresObjectResponse> =
        getRequiresObject(params, RequestOptions.none())

    /** @see getRequiresObject */
    fun getRequiresObject(
        params: ActionGetRequiresObjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionDefinitionRequiresObjectResponse>

    /**
     * A view of [ActionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /automation/actions/2026-03/{appId}`, but is
         * otherwise the same as [ActionServiceAsync.create].
         */
        fun create(
            appId: Int,
            params: ActionCreateParams,
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>> =
            create(appId, params, RequestOptions.none())

        /** @see create */
        fun create(
            appId: Int,
            params: ActionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        fun create(
            params: ActionCreateParams
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ActionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>>

        /**
         * Returns a raw HTTP response for `patch
         * /automation/actions/2026-03/{appId}/{definitionId}`, but is otherwise the same as
         * [ActionServiceAsync.update].
         */
        fun update(
            definitionId: String,
            params: ActionUpdateParams,
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>> =
            update(definitionId, params, RequestOptions.none())

        /** @see update */
        fun update(
            definitionId: String,
            params: ActionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>> =
            update(params.toBuilder().definitionId(definitionId).build(), requestOptions)

        /** @see update */
        fun update(
            params: ActionUpdateParams
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ActionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>>

        /**
         * Returns a raw HTTP response for `get
         * /automation/actions/2026-03/{appId}/{definitionId}/revisions`, but is otherwise the same
         * as [ActionServiceAsync.list].
         */
        fun list(
            definitionId: String,
            params: ActionListParams,
        ): CompletableFuture<HttpResponseFor<ActionListPageAsync>> =
            list(definitionId, params, RequestOptions.none())

        /** @see list */
        fun list(
            definitionId: String,
            params: ActionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionListPageAsync>> =
            list(params.toBuilder().definitionId(definitionId).build(), requestOptions)

        /** @see list */
        fun list(
            params: ActionListParams
        ): CompletableFuture<HttpResponseFor<ActionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ActionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete
         * /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}/{functionId}`,
         * but is otherwise the same as [ActionServiceAsync.delete].
         */
        fun delete(
            functionId: String,
            params: ActionDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(functionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            functionId: String,
            params: ActionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see delete */
        fun delete(params: ActionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ActionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /automation/actions/callbacks/2026-03/{callbackId}/complete`, but is otherwise the same
         * as [ActionServiceAsync.complete].
         */
        fun complete(
            callbackId: String,
            params: ActionCompleteParams,
        ): CompletableFuture<HttpResponse> = complete(callbackId, params, RequestOptions.none())

        /** @see complete */
        fun complete(
            callbackId: String,
            params: ActionCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            complete(params.toBuilder().callbackId(callbackId).build(), requestOptions)

        /** @see complete */
        fun complete(params: ActionCompleteParams): CompletableFuture<HttpResponse> =
            complete(params, RequestOptions.none())

        /** @see complete */
        fun complete(
            params: ActionCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /automation/actions/callbacks/2026-03/complete`,
         * but is otherwise the same as [ActionServiceAsync.completeBatch].
         */
        fun completeBatch(params: ActionCompleteBatchParams): CompletableFuture<HttpResponse> =
            completeBatch(params, RequestOptions.none())

        /** @see completeBatch */
        fun completeBatch(
            params: ActionCompleteBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see completeBatch */
        fun completeBatch(
            batchInputCallbackCompletionBatchRequest: BatchInputCallbackCompletionBatchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            completeBatch(
                ActionCompleteBatchParams.builder()
                    .batchInputCallbackCompletionBatchRequest(
                        batchInputCallbackCompletionBatchRequest
                    )
                    .build(),
                requestOptions,
            )

        /** @see completeBatch */
        fun completeBatch(
            batchInputCallbackCompletionBatchRequest: BatchInputCallbackCompletionBatchRequest
        ): CompletableFuture<HttpResponse> =
            completeBatch(batchInputCallbackCompletionBatchRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put
         * /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}/{functionId}`,
         * but is otherwise the same as [ActionServiceAsync.createOrReplace].
         */
        fun createOrReplace(
            functionId: String,
            params: ActionCreateOrReplaceParams,
        ): CompletableFuture<HttpResponseFor<PublicActionFunctionIdentifier>> =
            createOrReplace(functionId, params, RequestOptions.none())

        /** @see createOrReplace */
        fun createOrReplace(
            functionId: String,
            params: ActionCreateOrReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionFunctionIdentifier>> =
            createOrReplace(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see createOrReplace */
        fun createOrReplace(
            params: ActionCreateOrReplaceParams
        ): CompletableFuture<HttpResponseFor<PublicActionFunctionIdentifier>> =
            createOrReplace(params, RequestOptions.none())

        /** @see createOrReplace */
        fun createOrReplace(
            params: ActionCreateOrReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionFunctionIdentifier>>

        /**
         * Returns a raw HTTP response for `put
         * /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}`, but is
         * otherwise the same as [ActionServiceAsync.createOrReplaceByFunctionType].
         */
        fun createOrReplaceByFunctionType(
            functionType: ActionCreateOrReplaceByFunctionTypeParams.FunctionType,
            params: ActionCreateOrReplaceByFunctionTypeParams,
        ): CompletableFuture<HttpResponseFor<PublicActionFunctionIdentifier>> =
            createOrReplaceByFunctionType(functionType, params, RequestOptions.none())

        /** @see createOrReplaceByFunctionType */
        fun createOrReplaceByFunctionType(
            functionType: ActionCreateOrReplaceByFunctionTypeParams.FunctionType,
            params: ActionCreateOrReplaceByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionFunctionIdentifier>> =
            createOrReplaceByFunctionType(
                params.toBuilder().functionType(functionType).build(),
                requestOptions,
            )

        /** @see createOrReplaceByFunctionType */
        fun createOrReplaceByFunctionType(
            params: ActionCreateOrReplaceByFunctionTypeParams
        ): CompletableFuture<HttpResponseFor<PublicActionFunctionIdentifier>> =
            createOrReplaceByFunctionType(params, RequestOptions.none())

        /** @see createOrReplaceByFunctionType */
        fun createOrReplaceByFunctionType(
            params: ActionCreateOrReplaceByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionFunctionIdentifier>>

        /**
         * Returns a raw HTTP response for `post
         * /automation/actions/2026-03/{appId}/{definitionId}/requires-object`, but is otherwise the
         * same as [ActionServiceAsync.createRequiresObject].
         */
        fun createRequiresObject(
            definitionId: String,
            params: ActionCreateRequiresObjectParams,
        ): CompletableFuture<HttpResponse> =
            createRequiresObject(definitionId, params, RequestOptions.none())

        /** @see createRequiresObject */
        fun createRequiresObject(
            definitionId: String,
            params: ActionCreateRequiresObjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            createRequiresObject(
                params.toBuilder().definitionId(definitionId).build(),
                requestOptions,
            )

        /** @see createRequiresObject */
        fun createRequiresObject(
            params: ActionCreateRequiresObjectParams
        ): CompletableFuture<HttpResponse> = createRequiresObject(params, RequestOptions.none())

        /** @see createRequiresObject */
        fun createRequiresObject(
            params: ActionCreateRequiresObjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}`, but is
         * otherwise the same as [ActionServiceAsync.deleteByFunctionType].
         */
        fun deleteByFunctionType(
            functionType: ActionDeleteByFunctionTypeParams.FunctionType,
            params: ActionDeleteByFunctionTypeParams,
        ): CompletableFuture<HttpResponse> =
            deleteByFunctionType(functionType, params, RequestOptions.none())

        /** @see deleteByFunctionType */
        fun deleteByFunctionType(
            functionType: ActionDeleteByFunctionTypeParams.FunctionType,
            params: ActionDeleteByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteByFunctionType(
                params.toBuilder().functionType(functionType).build(),
                requestOptions,
            )

        /** @see deleteByFunctionType */
        fun deleteByFunctionType(
            params: ActionDeleteByFunctionTypeParams
        ): CompletableFuture<HttpResponse> = deleteByFunctionType(params, RequestOptions.none())

        /** @see deleteByFunctionType */
        fun deleteByFunctionType(
            params: ActionDeleteByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /automation/actions/2026-03/{appId}/{definitionId}/revisions/{revisionId}`, but is
         * otherwise the same as [ActionServiceAsync.get].
         */
        fun get(
            revisionId: String,
            params: ActionGetParams,
        ): CompletableFuture<HttpResponseFor<PublicActionRevision>> =
            get(revisionId, params, RequestOptions.none())

        /** @see get */
        fun get(
            revisionId: String,
            params: ActionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionRevision>> =
            get(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see get */
        fun get(params: ActionGetParams): CompletableFuture<HttpResponseFor<PublicActionRevision>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ActionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionRevision>>

        /**
         * Returns a raw HTTP response for `get
         * /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}`, but is
         * otherwise the same as [ActionServiceAsync.getByFunctionType].
         */
        fun getByFunctionType(
            functionType: ActionGetByFunctionTypeParams.FunctionType,
            params: ActionGetByFunctionTypeParams,
        ): CompletableFuture<HttpResponseFor<PublicActionFunction>> =
            getByFunctionType(functionType, params, RequestOptions.none())

        /** @see getByFunctionType */
        fun getByFunctionType(
            functionType: ActionGetByFunctionTypeParams.FunctionType,
            params: ActionGetByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionFunction>> =
            getByFunctionType(params.toBuilder().functionType(functionType).build(), requestOptions)

        /** @see getByFunctionType */
        fun getByFunctionType(
            params: ActionGetByFunctionTypeParams
        ): CompletableFuture<HttpResponseFor<PublicActionFunction>> =
            getByFunctionType(params, RequestOptions.none())

        /** @see getByFunctionType */
        fun getByFunctionType(
            params: ActionGetByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionFunction>>

        /**
         * Returns a raw HTTP response for `get
         * /automation/actions/2026-03/{appId}/{definitionId}/requires-object`, but is otherwise the
         * same as [ActionServiceAsync.getRequiresObject].
         */
        fun getRequiresObject(
            definitionId: String,
            params: ActionGetRequiresObjectParams,
        ): CompletableFuture<HttpResponseFor<PublicActionDefinitionRequiresObjectResponse>> =
            getRequiresObject(definitionId, params, RequestOptions.none())

        /** @see getRequiresObject */
        fun getRequiresObject(
            definitionId: String,
            params: ActionGetRequiresObjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionDefinitionRequiresObjectResponse>> =
            getRequiresObject(params.toBuilder().definitionId(definitionId).build(), requestOptions)

        /** @see getRequiresObject */
        fun getRequiresObject(
            params: ActionGetRequiresObjectParams
        ): CompletableFuture<HttpResponseFor<PublicActionDefinitionRequiresObjectResponse>> =
            getRequiresObject(params, RequestOptions.none())

        /** @see getRequiresObject */
        fun getRequiresObject(
            params: ActionGetRequiresObjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionDefinitionRequiresObjectResponse>>
    }
}
