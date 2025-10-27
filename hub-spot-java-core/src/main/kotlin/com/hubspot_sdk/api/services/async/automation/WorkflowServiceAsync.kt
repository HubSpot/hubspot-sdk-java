// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.automation.workflows.ApiFlow
import com.hubspot_sdk.api.models.automation.workflows.ApiFlowBatchInput
import com.hubspot_sdk.api.models.automation.workflows.ApiFlowBatchMigrationInput
import com.hubspot_sdk.api.models.automation.workflows.ApiFlowCreateRequest
import com.hubspot_sdk.api.models.automation.workflows.BatchResponseApiFlow
import com.hubspot_sdk.api.models.automation.workflows.BatchResponseFlowIdWorkflowIdMappingResponse
import com.hubspot_sdk.api.models.automation.workflows.CollectionResponseApiFlowEmailCampaign
import com.hubspot_sdk.api.models.automation.workflows.WorkflowBatchGetIdMappingsParams
import com.hubspot_sdk.api.models.automation.workflows.WorkflowBatchGetParams
import com.hubspot_sdk.api.models.automation.workflows.WorkflowCreateParams
import com.hubspot_sdk.api.models.automation.workflows.WorkflowDeleteParams
import com.hubspot_sdk.api.models.automation.workflows.WorkflowGetParams
import com.hubspot_sdk.api.models.automation.workflows.WorkflowListEmailCampaignsParams
import com.hubspot_sdk.api.models.automation.workflows.WorkflowListPageAsync
import com.hubspot_sdk.api.models.automation.workflows.WorkflowListParams
import com.hubspot_sdk.api.models.automation.workflows.WorkflowUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WorkflowServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkflowServiceAsync

    /** Create a new workflow. */
    fun create(params: WorkflowCreateParams): CompletableFuture<ApiFlow> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WorkflowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiFlow>

    /** @see create */
    fun create(
        apiFlowCreateRequest: ApiFlowCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiFlow> =
        create(
            WorkflowCreateParams.builder().apiFlowCreateRequest(apiFlowCreateRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(apiFlowCreateRequest: ApiFlowCreateRequest): CompletableFuture<ApiFlow> =
        create(apiFlowCreateRequest, RequestOptions.none())

    /** Update a workflow by ID. */
    fun update(flowId: String, params: WorkflowUpdateParams): CompletableFuture<ApiFlow> =
        update(flowId, params, RequestOptions.none())

    /** @see update */
    fun update(
        flowId: String,
        params: WorkflowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiFlow> =
        update(params.toBuilder().flowId(flowId).build(), requestOptions)

    /** @see update */
    fun update(params: WorkflowUpdateParams): CompletableFuture<ApiFlow> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WorkflowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiFlow>

    /** Retrieve all workflows from an account. */
    fun list(): CompletableFuture<WorkflowListPageAsync> = list(WorkflowListParams.none())

    /** @see list */
    fun list(
        params: WorkflowListParams = WorkflowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkflowListPageAsync>

    /** @see list */
    fun list(
        params: WorkflowListParams = WorkflowListParams.none()
    ): CompletableFuture<WorkflowListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<WorkflowListPageAsync> =
        list(WorkflowListParams.none(), requestOptions)

    /**
     * Fully delete a workflow by ID. Deleted workflows cannot be restored via the API. If you need
     * to restore an accidentally deleted flow, you'll need to contact support.
     */
    fun delete(flowId: Long): CompletableFuture<Void?> = delete(flowId, WorkflowDeleteParams.none())

    /** @see delete */
    fun delete(
        flowId: Long,
        params: WorkflowDeleteParams = WorkflowDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().flowId(flowId).build(), requestOptions)

    /** @see delete */
    fun delete(
        flowId: Long,
        params: WorkflowDeleteParams = WorkflowDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(flowId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WorkflowDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: WorkflowDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(flowId: Long, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(flowId, WorkflowDeleteParams.none(), requestOptions)

    /** Retrieve a batch of workflows by ID. */
    fun batchGet(params: WorkflowBatchGetParams): CompletableFuture<BatchResponseApiFlow> =
        batchGet(params, RequestOptions.none())

    /** @see batchGet */
    fun batchGet(
        params: WorkflowBatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseApiFlow>

    /** @see batchGet */
    fun batchGet(
        apiFlowBatchInput: ApiFlowBatchInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseApiFlow> =
        batchGet(
            WorkflowBatchGetParams.builder().apiFlowBatchInput(apiFlowBatchInput).build(),
            requestOptions,
        )

    /** @see batchGet */
    fun batchGet(apiFlowBatchInput: ApiFlowBatchInput): CompletableFuture<BatchResponseApiFlow> =
        batchGet(apiFlowBatchInput, RequestOptions.none())

    /** Retrieve the IDs of v3 workflows that have been migrated to the v4 API. */
    fun batchGetIdMappings(
        params: WorkflowBatchGetIdMappingsParams
    ): CompletableFuture<BatchResponseFlowIdWorkflowIdMappingResponse> =
        batchGetIdMappings(params, RequestOptions.none())

    /** @see batchGetIdMappings */
    fun batchGetIdMappings(
        params: WorkflowBatchGetIdMappingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseFlowIdWorkflowIdMappingResponse>

    /** @see batchGetIdMappings */
    fun batchGetIdMappings(
        apiFlowBatchMigrationInput: ApiFlowBatchMigrationInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseFlowIdWorkflowIdMappingResponse> =
        batchGetIdMappings(
            WorkflowBatchGetIdMappingsParams.builder()
                .apiFlowBatchMigrationInput(apiFlowBatchMigrationInput)
                .build(),
            requestOptions,
        )

    /** @see batchGetIdMappings */
    fun batchGetIdMappings(
        apiFlowBatchMigrationInput: ApiFlowBatchMigrationInput
    ): CompletableFuture<BatchResponseFlowIdWorkflowIdMappingResponse> =
        batchGetIdMappings(apiFlowBatchMigrationInput, RequestOptions.none())

    /** Retrieve all details for a specific workflow by ID. */
    fun get(flowId: String): CompletableFuture<ApiFlow> = get(flowId, WorkflowGetParams.none())

    /** @see get */
    fun get(
        flowId: String,
        params: WorkflowGetParams = WorkflowGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiFlow> = get(params.toBuilder().flowId(flowId).build(), requestOptions)

    /** @see get */
    fun get(
        flowId: String,
        params: WorkflowGetParams = WorkflowGetParams.none(),
    ): CompletableFuture<ApiFlow> = get(flowId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: WorkflowGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiFlow>

    /** @see get */
    fun get(params: WorkflowGetParams): CompletableFuture<ApiFlow> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(flowId: String, requestOptions: RequestOptions): CompletableFuture<ApiFlow> =
        get(flowId, WorkflowGetParams.none(), requestOptions)

    /** Retrieve emails sent by a workflow by ID. */
    fun listEmailCampaigns(): CompletableFuture<CollectionResponseApiFlowEmailCampaign> =
        listEmailCampaigns(WorkflowListEmailCampaignsParams.none())

    /** @see listEmailCampaigns */
    fun listEmailCampaigns(
        params: WorkflowListEmailCampaignsParams = WorkflowListEmailCampaignsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseApiFlowEmailCampaign>

    /** @see listEmailCampaigns */
    fun listEmailCampaigns(
        params: WorkflowListEmailCampaignsParams = WorkflowListEmailCampaignsParams.none()
    ): CompletableFuture<CollectionResponseApiFlowEmailCampaign> =
        listEmailCampaigns(params, RequestOptions.none())

    /** @see listEmailCampaigns */
    fun listEmailCampaigns(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponseApiFlowEmailCampaign> =
        listEmailCampaigns(WorkflowListEmailCampaignsParams.none(), requestOptions)

    /**
     * A view of [WorkflowServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkflowServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /automation/v4/flows`, but is otherwise the same as
         * [WorkflowServiceAsync.create].
         */
        fun create(params: WorkflowCreateParams): CompletableFuture<HttpResponseFor<ApiFlow>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: WorkflowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiFlow>>

        /** @see create */
        fun create(
            apiFlowCreateRequest: ApiFlowCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiFlow>> =
            create(
                WorkflowCreateParams.builder().apiFlowCreateRequest(apiFlowCreateRequest).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            apiFlowCreateRequest: ApiFlowCreateRequest
        ): CompletableFuture<HttpResponseFor<ApiFlow>> =
            create(apiFlowCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /automation/v4/flows/{flowId}`, but is otherwise the
         * same as [WorkflowServiceAsync.update].
         */
        fun update(
            flowId: String,
            params: WorkflowUpdateParams,
        ): CompletableFuture<HttpResponseFor<ApiFlow>> =
            update(flowId, params, RequestOptions.none())

        /** @see update */
        fun update(
            flowId: String,
            params: WorkflowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiFlow>> =
            update(params.toBuilder().flowId(flowId).build(), requestOptions)

        /** @see update */
        fun update(params: WorkflowUpdateParams): CompletableFuture<HttpResponseFor<ApiFlow>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: WorkflowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiFlow>>

        /**
         * Returns a raw HTTP response for `get /automation/v4/flows`, but is otherwise the same as
         * [WorkflowServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<WorkflowListPageAsync>> =
            list(WorkflowListParams.none())

        /** @see list */
        fun list(
            params: WorkflowListParams = WorkflowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkflowListPageAsync>>

        /** @see list */
        fun list(
            params: WorkflowListParams = WorkflowListParams.none()
        ): CompletableFuture<HttpResponseFor<WorkflowListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WorkflowListPageAsync>> =
            list(WorkflowListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /automation/v4/flows/{flowId}`, but is otherwise
         * the same as [WorkflowServiceAsync.delete].
         */
        fun delete(flowId: Long): CompletableFuture<HttpResponse> =
            delete(flowId, WorkflowDeleteParams.none())

        /** @see delete */
        fun delete(
            flowId: Long,
            params: WorkflowDeleteParams = WorkflowDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().flowId(flowId).build(), requestOptions)

        /** @see delete */
        fun delete(
            flowId: Long,
            params: WorkflowDeleteParams = WorkflowDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(flowId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: WorkflowDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: WorkflowDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(flowId: Long, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(flowId, WorkflowDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /automation/v4/flows/batch/read`, but is otherwise
         * the same as [WorkflowServiceAsync.batchGet].
         */
        fun batchGet(
            params: WorkflowBatchGetParams
        ): CompletableFuture<HttpResponseFor<BatchResponseApiFlow>> =
            batchGet(params, RequestOptions.none())

        /** @see batchGet */
        fun batchGet(
            params: WorkflowBatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseApiFlow>>

        /** @see batchGet */
        fun batchGet(
            apiFlowBatchInput: ApiFlowBatchInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseApiFlow>> =
            batchGet(
                WorkflowBatchGetParams.builder().apiFlowBatchInput(apiFlowBatchInput).build(),
                requestOptions,
            )

        /** @see batchGet */
        fun batchGet(
            apiFlowBatchInput: ApiFlowBatchInput
        ): CompletableFuture<HttpResponseFor<BatchResponseApiFlow>> =
            batchGet(apiFlowBatchInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /automation/v4/workflow-id-mappings/batch/read`,
         * but is otherwise the same as [WorkflowServiceAsync.batchGetIdMappings].
         */
        fun batchGetIdMappings(
            params: WorkflowBatchGetIdMappingsParams
        ): CompletableFuture<HttpResponseFor<BatchResponseFlowIdWorkflowIdMappingResponse>> =
            batchGetIdMappings(params, RequestOptions.none())

        /** @see batchGetIdMappings */
        fun batchGetIdMappings(
            params: WorkflowBatchGetIdMappingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseFlowIdWorkflowIdMappingResponse>>

        /** @see batchGetIdMappings */
        fun batchGetIdMappings(
            apiFlowBatchMigrationInput: ApiFlowBatchMigrationInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseFlowIdWorkflowIdMappingResponse>> =
            batchGetIdMappings(
                WorkflowBatchGetIdMappingsParams.builder()
                    .apiFlowBatchMigrationInput(apiFlowBatchMigrationInput)
                    .build(),
                requestOptions,
            )

        /** @see batchGetIdMappings */
        fun batchGetIdMappings(
            apiFlowBatchMigrationInput: ApiFlowBatchMigrationInput
        ): CompletableFuture<HttpResponseFor<BatchResponseFlowIdWorkflowIdMappingResponse>> =
            batchGetIdMappings(apiFlowBatchMigrationInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /automation/v4/flows/{flowId}`, but is otherwise the
         * same as [WorkflowServiceAsync.get].
         */
        fun get(flowId: String): CompletableFuture<HttpResponseFor<ApiFlow>> =
            get(flowId, WorkflowGetParams.none())

        /** @see get */
        fun get(
            flowId: String,
            params: WorkflowGetParams = WorkflowGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiFlow>> =
            get(params.toBuilder().flowId(flowId).build(), requestOptions)

        /** @see get */
        fun get(
            flowId: String,
            params: WorkflowGetParams = WorkflowGetParams.none(),
        ): CompletableFuture<HttpResponseFor<ApiFlow>> = get(flowId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: WorkflowGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiFlow>>

        /** @see get */
        fun get(params: WorkflowGetParams): CompletableFuture<HttpResponseFor<ApiFlow>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            flowId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiFlow>> =
            get(flowId, WorkflowGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /automation/v4/flows/email-campaigns`, but is
         * otherwise the same as [WorkflowServiceAsync.listEmailCampaigns].
         */
        fun listEmailCampaigns():
            CompletableFuture<HttpResponseFor<CollectionResponseApiFlowEmailCampaign>> =
            listEmailCampaigns(WorkflowListEmailCampaignsParams.none())

        /** @see listEmailCampaigns */
        fun listEmailCampaigns(
            params: WorkflowListEmailCampaignsParams = WorkflowListEmailCampaignsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseApiFlowEmailCampaign>>

        /** @see listEmailCampaigns */
        fun listEmailCampaigns(
            params: WorkflowListEmailCampaignsParams = WorkflowListEmailCampaignsParams.none()
        ): CompletableFuture<HttpResponseFor<CollectionResponseApiFlowEmailCampaign>> =
            listEmailCampaigns(params, RequestOptions.none())

        /** @see listEmailCampaigns */
        fun listEmailCampaigns(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CollectionResponseApiFlowEmailCampaign>> =
            listEmailCampaigns(WorkflowListEmailCampaignsParams.none(), requestOptions)
    }
}
