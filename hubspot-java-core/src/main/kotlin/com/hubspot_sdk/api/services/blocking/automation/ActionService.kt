// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation

import com.google.errorprone.annotations.MustBeClosed
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
import com.hubspot_sdk.api.models.automation.actions.ActionListPage
import com.hubspot_sdk.api.models.automation.actions.ActionListParams
import com.hubspot_sdk.api.models.automation.actions.ActionUpdateParams
import com.hubspot_sdk.api.models.automation.actions.BatchInputCallbackCompletionBatchRequest
import com.hubspot_sdk.api.models.automation.actions.PublicActionDefinition
import com.hubspot_sdk.api.models.automation.actions.PublicActionDefinitionRequiresObjectResponse
import com.hubspot_sdk.api.models.automation.actions.PublicActionFunction
import com.hubspot_sdk.api.models.automation.actions.PublicActionFunctionIdentifier
import com.hubspot_sdk.api.models.automation.actions.PublicActionRevision
import java.util.function.Consumer

interface ActionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService

    fun create(appId: Int, params: ActionCreateParams): PublicActionDefinition =
        create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: ActionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionDefinition = create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(params: ActionCreateParams): PublicActionDefinition =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ActionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionDefinition

    fun update(definitionId: String, params: ActionUpdateParams): PublicActionDefinition =
        update(definitionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        definitionId: String,
        params: ActionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionDefinition =
        update(params.toBuilder().definitionId(definitionId).build(), requestOptions)

    /** @see update */
    fun update(params: ActionUpdateParams): PublicActionDefinition =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ActionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionDefinition

    fun list(definitionId: String, params: ActionListParams): ActionListPage =
        list(definitionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        definitionId: String,
        params: ActionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionListPage = list(params.toBuilder().definitionId(definitionId).build(), requestOptions)

    /** @see list */
    fun list(params: ActionListParams): ActionListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ActionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionListPage

    fun delete(functionId: String, params: ActionDeleteParams) =
        delete(functionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        functionId: String,
        params: ActionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ActionDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ActionDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    fun complete(callbackId: String, params: ActionCompleteParams) =
        complete(callbackId, params, RequestOptions.none())

    /** @see complete */
    fun complete(
        callbackId: String,
        params: ActionCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = complete(params.toBuilder().callbackId(callbackId).build(), requestOptions)

    /** @see complete */
    fun complete(params: ActionCompleteParams) = complete(params, RequestOptions.none())

    /** @see complete */
    fun complete(
        params: ActionCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    fun completeBatch(params: ActionCompleteBatchParams) =
        completeBatch(params, RequestOptions.none())

    /** @see completeBatch */
    fun completeBatch(
        params: ActionCompleteBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see completeBatch */
    fun completeBatch(
        batchInputCallbackCompletionBatchRequest: BatchInputCallbackCompletionBatchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        completeBatch(
            ActionCompleteBatchParams.builder()
                .batchInputCallbackCompletionBatchRequest(batchInputCallbackCompletionBatchRequest)
                .build(),
            requestOptions,
        )

    /** @see completeBatch */
    fun completeBatch(
        batchInputCallbackCompletionBatchRequest: BatchInputCallbackCompletionBatchRequest
    ) = completeBatch(batchInputCallbackCompletionBatchRequest, RequestOptions.none())

    fun createOrReplace(
        functionId: String,
        params: ActionCreateOrReplaceParams,
    ): PublicActionFunctionIdentifier = createOrReplace(functionId, params, RequestOptions.none())

    /** @see createOrReplace */
    fun createOrReplace(
        functionId: String,
        params: ActionCreateOrReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionFunctionIdentifier =
        createOrReplace(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see createOrReplace */
    fun createOrReplace(params: ActionCreateOrReplaceParams): PublicActionFunctionIdentifier =
        createOrReplace(params, RequestOptions.none())

    /** @see createOrReplace */
    fun createOrReplace(
        params: ActionCreateOrReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionFunctionIdentifier

    fun createOrReplaceByFunctionType(
        functionType: ActionCreateOrReplaceByFunctionTypeParams.FunctionType,
        params: ActionCreateOrReplaceByFunctionTypeParams,
    ): PublicActionFunctionIdentifier =
        createOrReplaceByFunctionType(functionType, params, RequestOptions.none())

    /** @see createOrReplaceByFunctionType */
    fun createOrReplaceByFunctionType(
        functionType: ActionCreateOrReplaceByFunctionTypeParams.FunctionType,
        params: ActionCreateOrReplaceByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionFunctionIdentifier =
        createOrReplaceByFunctionType(
            params.toBuilder().functionType(functionType).build(),
            requestOptions,
        )

    /** @see createOrReplaceByFunctionType */
    fun createOrReplaceByFunctionType(
        params: ActionCreateOrReplaceByFunctionTypeParams
    ): PublicActionFunctionIdentifier = createOrReplaceByFunctionType(params, RequestOptions.none())

    /** @see createOrReplaceByFunctionType */
    fun createOrReplaceByFunctionType(
        params: ActionCreateOrReplaceByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionFunctionIdentifier

    fun createRequiresObject(definitionId: String, params: ActionCreateRequiresObjectParams) =
        createRequiresObject(definitionId, params, RequestOptions.none())

    /** @see createRequiresObject */
    fun createRequiresObject(
        definitionId: String,
        params: ActionCreateRequiresObjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = createRequiresObject(params.toBuilder().definitionId(definitionId).build(), requestOptions)

    /** @see createRequiresObject */
    fun createRequiresObject(params: ActionCreateRequiresObjectParams) =
        createRequiresObject(params, RequestOptions.none())

    /** @see createRequiresObject */
    fun createRequiresObject(
        params: ActionCreateRequiresObjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    fun deleteByFunctionType(
        functionType: ActionDeleteByFunctionTypeParams.FunctionType,
        params: ActionDeleteByFunctionTypeParams,
    ) = deleteByFunctionType(functionType, params, RequestOptions.none())

    /** @see deleteByFunctionType */
    fun deleteByFunctionType(
        functionType: ActionDeleteByFunctionTypeParams.FunctionType,
        params: ActionDeleteByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteByFunctionType(params.toBuilder().functionType(functionType).build(), requestOptions)

    /** @see deleteByFunctionType */
    fun deleteByFunctionType(params: ActionDeleteByFunctionTypeParams) =
        deleteByFunctionType(params, RequestOptions.none())

    /** @see deleteByFunctionType */
    fun deleteByFunctionType(
        params: ActionDeleteByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    fun get(revisionId: String, params: ActionGetParams): PublicActionRevision =
        get(revisionId, params, RequestOptions.none())

    /** @see get */
    fun get(
        revisionId: String,
        params: ActionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionRevision = get(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see get */
    fun get(params: ActionGetParams): PublicActionRevision = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ActionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionRevision

    fun getByFunctionType(
        functionType: ActionGetByFunctionTypeParams.FunctionType,
        params: ActionGetByFunctionTypeParams,
    ): PublicActionFunction = getByFunctionType(functionType, params, RequestOptions.none())

    /** @see getByFunctionType */
    fun getByFunctionType(
        functionType: ActionGetByFunctionTypeParams.FunctionType,
        params: ActionGetByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionFunction =
        getByFunctionType(params.toBuilder().functionType(functionType).build(), requestOptions)

    /** @see getByFunctionType */
    fun getByFunctionType(params: ActionGetByFunctionTypeParams): PublicActionFunction =
        getByFunctionType(params, RequestOptions.none())

    /** @see getByFunctionType */
    fun getByFunctionType(
        params: ActionGetByFunctionTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionFunction

    fun getRequiresObject(
        definitionId: String,
        params: ActionGetRequiresObjectParams,
    ): PublicActionDefinitionRequiresObjectResponse =
        getRequiresObject(definitionId, params, RequestOptions.none())

    /** @see getRequiresObject */
    fun getRequiresObject(
        definitionId: String,
        params: ActionGetRequiresObjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionDefinitionRequiresObjectResponse =
        getRequiresObject(params.toBuilder().definitionId(definitionId).build(), requestOptions)

    /** @see getRequiresObject */
    fun getRequiresObject(
        params: ActionGetRequiresObjectParams
    ): PublicActionDefinitionRequiresObjectResponse =
        getRequiresObject(params, RequestOptions.none())

    /** @see getRequiresObject */
    fun getRequiresObject(
        params: ActionGetRequiresObjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActionDefinitionRequiresObjectResponse

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /automation/actions/2026-03/{appId}`, but is
         * otherwise the same as [ActionService.create].
         */
        @MustBeClosed
        fun create(
            appId: Int,
            params: ActionCreateParams,
        ): HttpResponseFor<PublicActionDefinition> = create(appId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            appId: Int,
            params: ActionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionDefinition> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ActionCreateParams): HttpResponseFor<PublicActionDefinition> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ActionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionDefinition>

        /**
         * Returns a raw HTTP response for `patch
         * /automation/actions/2026-03/{appId}/{definitionId}`, but is otherwise the same as
         * [ActionService.update].
         */
        @MustBeClosed
        fun update(
            definitionId: String,
            params: ActionUpdateParams,
        ): HttpResponseFor<PublicActionDefinition> =
            update(definitionId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            definitionId: String,
            params: ActionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionDefinition> =
            update(params.toBuilder().definitionId(definitionId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ActionUpdateParams): HttpResponseFor<PublicActionDefinition> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ActionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionDefinition>

        /**
         * Returns a raw HTTP response for `get
         * /automation/actions/2026-03/{appId}/{definitionId}/revisions`, but is otherwise the same
         * as [ActionService.list].
         */
        @MustBeClosed
        fun list(definitionId: String, params: ActionListParams): HttpResponseFor<ActionListPage> =
            list(definitionId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            definitionId: String,
            params: ActionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionListPage> =
            list(params.toBuilder().definitionId(definitionId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: ActionListParams): HttpResponseFor<ActionListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ActionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}/{functionId}`,
         * but is otherwise the same as [ActionService.delete].
         */
        @MustBeClosed
        fun delete(functionId: String, params: ActionDeleteParams): HttpResponse =
            delete(functionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            functionId: String,
            params: ActionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: ActionDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ActionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /automation/actions/callbacks/2026-03/{callbackId}/complete`, but is otherwise the same
         * as [ActionService.complete].
         */
        @MustBeClosed
        fun complete(callbackId: String, params: ActionCompleteParams): HttpResponse =
            complete(callbackId, params, RequestOptions.none())

        /** @see complete */
        @MustBeClosed
        fun complete(
            callbackId: String,
            params: ActionCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            complete(params.toBuilder().callbackId(callbackId).build(), requestOptions)

        /** @see complete */
        @MustBeClosed
        fun complete(params: ActionCompleteParams): HttpResponse =
            complete(params, RequestOptions.none())

        /** @see complete */
        @MustBeClosed
        fun complete(
            params: ActionCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /automation/actions/callbacks/2026-03/complete`,
         * but is otherwise the same as [ActionService.completeBatch].
         */
        @MustBeClosed
        fun completeBatch(params: ActionCompleteBatchParams): HttpResponse =
            completeBatch(params, RequestOptions.none())

        /** @see completeBatch */
        @MustBeClosed
        fun completeBatch(
            params: ActionCompleteBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see completeBatch */
        @MustBeClosed
        fun completeBatch(
            batchInputCallbackCompletionBatchRequest: BatchInputCallbackCompletionBatchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            completeBatch(
                ActionCompleteBatchParams.builder()
                    .batchInputCallbackCompletionBatchRequest(
                        batchInputCallbackCompletionBatchRequest
                    )
                    .build(),
                requestOptions,
            )

        /** @see completeBatch */
        @MustBeClosed
        fun completeBatch(
            batchInputCallbackCompletionBatchRequest: BatchInputCallbackCompletionBatchRequest
        ): HttpResponse =
            completeBatch(batchInputCallbackCompletionBatchRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put
         * /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}/{functionId}`,
         * but is otherwise the same as [ActionService.createOrReplace].
         */
        @MustBeClosed
        fun createOrReplace(
            functionId: String,
            params: ActionCreateOrReplaceParams,
        ): HttpResponseFor<PublicActionFunctionIdentifier> =
            createOrReplace(functionId, params, RequestOptions.none())

        /** @see createOrReplace */
        @MustBeClosed
        fun createOrReplace(
            functionId: String,
            params: ActionCreateOrReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionFunctionIdentifier> =
            createOrReplace(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see createOrReplace */
        @MustBeClosed
        fun createOrReplace(
            params: ActionCreateOrReplaceParams
        ): HttpResponseFor<PublicActionFunctionIdentifier> =
            createOrReplace(params, RequestOptions.none())

        /** @see createOrReplace */
        @MustBeClosed
        fun createOrReplace(
            params: ActionCreateOrReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionFunctionIdentifier>

        /**
         * Returns a raw HTTP response for `put
         * /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}`, but is
         * otherwise the same as [ActionService.createOrReplaceByFunctionType].
         */
        @MustBeClosed
        fun createOrReplaceByFunctionType(
            functionType: ActionCreateOrReplaceByFunctionTypeParams.FunctionType,
            params: ActionCreateOrReplaceByFunctionTypeParams,
        ): HttpResponseFor<PublicActionFunctionIdentifier> =
            createOrReplaceByFunctionType(functionType, params, RequestOptions.none())

        /** @see createOrReplaceByFunctionType */
        @MustBeClosed
        fun createOrReplaceByFunctionType(
            functionType: ActionCreateOrReplaceByFunctionTypeParams.FunctionType,
            params: ActionCreateOrReplaceByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionFunctionIdentifier> =
            createOrReplaceByFunctionType(
                params.toBuilder().functionType(functionType).build(),
                requestOptions,
            )

        /** @see createOrReplaceByFunctionType */
        @MustBeClosed
        fun createOrReplaceByFunctionType(
            params: ActionCreateOrReplaceByFunctionTypeParams
        ): HttpResponseFor<PublicActionFunctionIdentifier> =
            createOrReplaceByFunctionType(params, RequestOptions.none())

        /** @see createOrReplaceByFunctionType */
        @MustBeClosed
        fun createOrReplaceByFunctionType(
            params: ActionCreateOrReplaceByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionFunctionIdentifier>

        /**
         * Returns a raw HTTP response for `post
         * /automation/actions/2026-03/{appId}/{definitionId}/requires-object`, but is otherwise the
         * same as [ActionService.createRequiresObject].
         */
        @MustBeClosed
        fun createRequiresObject(
            definitionId: String,
            params: ActionCreateRequiresObjectParams,
        ): HttpResponse = createRequiresObject(definitionId, params, RequestOptions.none())

        /** @see createRequiresObject */
        @MustBeClosed
        fun createRequiresObject(
            definitionId: String,
            params: ActionCreateRequiresObjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            createRequiresObject(
                params.toBuilder().definitionId(definitionId).build(),
                requestOptions,
            )

        /** @see createRequiresObject */
        @MustBeClosed
        fun createRequiresObject(params: ActionCreateRequiresObjectParams): HttpResponse =
            createRequiresObject(params, RequestOptions.none())

        /** @see createRequiresObject */
        @MustBeClosed
        fun createRequiresObject(
            params: ActionCreateRequiresObjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete
         * /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}`, but is
         * otherwise the same as [ActionService.deleteByFunctionType].
         */
        @MustBeClosed
        fun deleteByFunctionType(
            functionType: ActionDeleteByFunctionTypeParams.FunctionType,
            params: ActionDeleteByFunctionTypeParams,
        ): HttpResponse = deleteByFunctionType(functionType, params, RequestOptions.none())

        /** @see deleteByFunctionType */
        @MustBeClosed
        fun deleteByFunctionType(
            functionType: ActionDeleteByFunctionTypeParams.FunctionType,
            params: ActionDeleteByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteByFunctionType(
                params.toBuilder().functionType(functionType).build(),
                requestOptions,
            )

        /** @see deleteByFunctionType */
        @MustBeClosed
        fun deleteByFunctionType(params: ActionDeleteByFunctionTypeParams): HttpResponse =
            deleteByFunctionType(params, RequestOptions.none())

        /** @see deleteByFunctionType */
        @MustBeClosed
        fun deleteByFunctionType(
            params: ActionDeleteByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /automation/actions/2026-03/{appId}/{definitionId}/revisions/{revisionId}`, but is
         * otherwise the same as [ActionService.get].
         */
        @MustBeClosed
        fun get(
            revisionId: String,
            params: ActionGetParams,
        ): HttpResponseFor<PublicActionRevision> = get(revisionId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            revisionId: String,
            params: ActionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionRevision> =
            get(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: ActionGetParams): HttpResponseFor<PublicActionRevision> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ActionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionRevision>

        /**
         * Returns a raw HTTP response for `get
         * /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}`, but is
         * otherwise the same as [ActionService.getByFunctionType].
         */
        @MustBeClosed
        fun getByFunctionType(
            functionType: ActionGetByFunctionTypeParams.FunctionType,
            params: ActionGetByFunctionTypeParams,
        ): HttpResponseFor<PublicActionFunction> =
            getByFunctionType(functionType, params, RequestOptions.none())

        /** @see getByFunctionType */
        @MustBeClosed
        fun getByFunctionType(
            functionType: ActionGetByFunctionTypeParams.FunctionType,
            params: ActionGetByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionFunction> =
            getByFunctionType(params.toBuilder().functionType(functionType).build(), requestOptions)

        /** @see getByFunctionType */
        @MustBeClosed
        fun getByFunctionType(
            params: ActionGetByFunctionTypeParams
        ): HttpResponseFor<PublicActionFunction> = getByFunctionType(params, RequestOptions.none())

        /** @see getByFunctionType */
        @MustBeClosed
        fun getByFunctionType(
            params: ActionGetByFunctionTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionFunction>

        /**
         * Returns a raw HTTP response for `get
         * /automation/actions/2026-03/{appId}/{definitionId}/requires-object`, but is otherwise the
         * same as [ActionService.getRequiresObject].
         */
        @MustBeClosed
        fun getRequiresObject(
            definitionId: String,
            params: ActionGetRequiresObjectParams,
        ): HttpResponseFor<PublicActionDefinitionRequiresObjectResponse> =
            getRequiresObject(definitionId, params, RequestOptions.none())

        /** @see getRequiresObject */
        @MustBeClosed
        fun getRequiresObject(
            definitionId: String,
            params: ActionGetRequiresObjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionDefinitionRequiresObjectResponse> =
            getRequiresObject(params.toBuilder().definitionId(definitionId).build(), requestOptions)

        /** @see getRequiresObject */
        @MustBeClosed
        fun getRequiresObject(
            params: ActionGetRequiresObjectParams
        ): HttpResponseFor<PublicActionDefinitionRequiresObjectResponse> =
            getRequiresObject(params, RequestOptions.none())

        /** @see getRequiresObject */
        @MustBeClosed
        fun getRequiresObject(
            params: ActionGetRequiresObjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActionDefinitionRequiresObjectResponse>
    }
}
