// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation

import com.google.errorprone.annotations.MustBeClosed
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
import com.hubspot_sdk.api.models.automation.workflows.WorkflowListPage
import com.hubspot_sdk.api.models.automation.workflows.WorkflowListParams
import com.hubspot_sdk.api.models.automation.workflows.WorkflowUpdateParams
import java.util.function.Consumer

interface WorkflowService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkflowService

    fun create(params: WorkflowCreateParams): ApiFlow = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WorkflowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiFlow

    /** @see create */
    fun create(
        apiFlowCreateRequest: ApiFlowCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiFlow =
        create(
            WorkflowCreateParams.builder().apiFlowCreateRequest(apiFlowCreateRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(apiFlowCreateRequest: ApiFlowCreateRequest): ApiFlow =
        create(apiFlowCreateRequest, RequestOptions.none())

    fun update(flowId: String, params: WorkflowUpdateParams): ApiFlow =
        update(flowId, params, RequestOptions.none())

    /** @see update */
    fun update(
        flowId: String,
        params: WorkflowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiFlow = update(params.toBuilder().flowId(flowId).build(), requestOptions)

    /** @see update */
    fun update(params: WorkflowUpdateParams): ApiFlow = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WorkflowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiFlow

    fun list(): WorkflowListPage = list(WorkflowListParams.none())

    /** @see list */
    fun list(
        params: WorkflowListParams = WorkflowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkflowListPage

    /** @see list */
    fun list(params: WorkflowListParams = WorkflowListParams.none()): WorkflowListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): WorkflowListPage =
        list(WorkflowListParams.none(), requestOptions)

    fun delete(flowId: Long) = delete(flowId, WorkflowDeleteParams.none())

    /** @see delete */
    fun delete(
        flowId: Long,
        params: WorkflowDeleteParams = WorkflowDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().flowId(flowId).build(), requestOptions)

    /** @see delete */
    fun delete(flowId: Long, params: WorkflowDeleteParams = WorkflowDeleteParams.none()) =
        delete(flowId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: WorkflowDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: WorkflowDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(flowId: Long, requestOptions: RequestOptions) =
        delete(flowId, WorkflowDeleteParams.none(), requestOptions)

    fun batchGet(params: WorkflowBatchGetParams): BatchResponseApiFlow =
        batchGet(params, RequestOptions.none())

    /** @see batchGet */
    fun batchGet(
        params: WorkflowBatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseApiFlow

    /** @see batchGet */
    fun batchGet(
        apiFlowBatchInput: ApiFlowBatchInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseApiFlow =
        batchGet(
            WorkflowBatchGetParams.builder().apiFlowBatchInput(apiFlowBatchInput).build(),
            requestOptions,
        )

    /** @see batchGet */
    fun batchGet(apiFlowBatchInput: ApiFlowBatchInput): BatchResponseApiFlow =
        batchGet(apiFlowBatchInput, RequestOptions.none())

    fun batchGetIdMappings(
        params: WorkflowBatchGetIdMappingsParams
    ): BatchResponseFlowIdWorkflowIdMappingResponse =
        batchGetIdMappings(params, RequestOptions.none())

    /** @see batchGetIdMappings */
    fun batchGetIdMappings(
        params: WorkflowBatchGetIdMappingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseFlowIdWorkflowIdMappingResponse

    /** @see batchGetIdMappings */
    fun batchGetIdMappings(
        apiFlowBatchMigrationInput: ApiFlowBatchMigrationInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseFlowIdWorkflowIdMappingResponse =
        batchGetIdMappings(
            WorkflowBatchGetIdMappingsParams.builder()
                .apiFlowBatchMigrationInput(apiFlowBatchMigrationInput)
                .build(),
            requestOptions,
        )

    /** @see batchGetIdMappings */
    fun batchGetIdMappings(
        apiFlowBatchMigrationInput: ApiFlowBatchMigrationInput
    ): BatchResponseFlowIdWorkflowIdMappingResponse =
        batchGetIdMappings(apiFlowBatchMigrationInput, RequestOptions.none())

    fun get(flowId: String): ApiFlow = get(flowId, WorkflowGetParams.none())

    /** @see get */
    fun get(
        flowId: String,
        params: WorkflowGetParams = WorkflowGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiFlow = get(params.toBuilder().flowId(flowId).build(), requestOptions)

    /** @see get */
    fun get(flowId: String, params: WorkflowGetParams = WorkflowGetParams.none()): ApiFlow =
        get(flowId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: WorkflowGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiFlow

    /** @see get */
    fun get(params: WorkflowGetParams): ApiFlow = get(params, RequestOptions.none())

    /** @see get */
    fun get(flowId: String, requestOptions: RequestOptions): ApiFlow =
        get(flowId, WorkflowGetParams.none(), requestOptions)

    fun listEmailCampaigns(): CollectionResponseApiFlowEmailCampaign =
        listEmailCampaigns(WorkflowListEmailCampaignsParams.none())

    /** @see listEmailCampaigns */
    fun listEmailCampaigns(
        params: WorkflowListEmailCampaignsParams = WorkflowListEmailCampaignsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseApiFlowEmailCampaign

    /** @see listEmailCampaigns */
    fun listEmailCampaigns(
        params: WorkflowListEmailCampaignsParams = WorkflowListEmailCampaignsParams.none()
    ): CollectionResponseApiFlowEmailCampaign = listEmailCampaigns(params, RequestOptions.none())

    /** @see listEmailCampaigns */
    fun listEmailCampaigns(requestOptions: RequestOptions): CollectionResponseApiFlowEmailCampaign =
        listEmailCampaigns(WorkflowListEmailCampaignsParams.none(), requestOptions)

    /** A view of [WorkflowService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkflowService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /automation/v4/flows`, but is otherwise the same as
         * [WorkflowService.create].
         */
        @MustBeClosed
        fun create(params: WorkflowCreateParams): HttpResponseFor<ApiFlow> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: WorkflowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiFlow>

        /** @see create */
        @MustBeClosed
        fun create(
            apiFlowCreateRequest: ApiFlowCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiFlow> =
            create(
                WorkflowCreateParams.builder().apiFlowCreateRequest(apiFlowCreateRequest).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(apiFlowCreateRequest: ApiFlowCreateRequest): HttpResponseFor<ApiFlow> =
            create(apiFlowCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /automation/v4/flows/{flowId}`, but is otherwise the
         * same as [WorkflowService.update].
         */
        @MustBeClosed
        fun update(flowId: String, params: WorkflowUpdateParams): HttpResponseFor<ApiFlow> =
            update(flowId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            flowId: String,
            params: WorkflowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiFlow> =
            update(params.toBuilder().flowId(flowId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: WorkflowUpdateParams): HttpResponseFor<ApiFlow> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: WorkflowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiFlow>

        /**
         * Returns a raw HTTP response for `get /automation/v4/flows`, but is otherwise the same as
         * [WorkflowService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<WorkflowListPage> = list(WorkflowListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WorkflowListParams = WorkflowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkflowListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: WorkflowListParams = WorkflowListParams.none()
        ): HttpResponseFor<WorkflowListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<WorkflowListPage> =
            list(WorkflowListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /automation/v4/flows/{flowId}`, but is otherwise
         * the same as [WorkflowService.delete].
         */
        @MustBeClosed
        fun delete(flowId: Long): HttpResponse = delete(flowId, WorkflowDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            flowId: Long,
            params: WorkflowDeleteParams = WorkflowDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().flowId(flowId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            flowId: Long,
            params: WorkflowDeleteParams = WorkflowDeleteParams.none(),
        ): HttpResponse = delete(flowId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: WorkflowDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: WorkflowDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(flowId: Long, requestOptions: RequestOptions): HttpResponse =
            delete(flowId, WorkflowDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /automation/v4/flows/batch/read`, but is otherwise
         * the same as [WorkflowService.batchGet].
         */
        @MustBeClosed
        fun batchGet(params: WorkflowBatchGetParams): HttpResponseFor<BatchResponseApiFlow> =
            batchGet(params, RequestOptions.none())

        /** @see batchGet */
        @MustBeClosed
        fun batchGet(
            params: WorkflowBatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseApiFlow>

        /** @see batchGet */
        @MustBeClosed
        fun batchGet(
            apiFlowBatchInput: ApiFlowBatchInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseApiFlow> =
            batchGet(
                WorkflowBatchGetParams.builder().apiFlowBatchInput(apiFlowBatchInput).build(),
                requestOptions,
            )

        /** @see batchGet */
        @MustBeClosed
        fun batchGet(apiFlowBatchInput: ApiFlowBatchInput): HttpResponseFor<BatchResponseApiFlow> =
            batchGet(apiFlowBatchInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /automation/v4/workflow-id-mappings/batch/read`,
         * but is otherwise the same as [WorkflowService.batchGetIdMappings].
         */
        @MustBeClosed
        fun batchGetIdMappings(
            params: WorkflowBatchGetIdMappingsParams
        ): HttpResponseFor<BatchResponseFlowIdWorkflowIdMappingResponse> =
            batchGetIdMappings(params, RequestOptions.none())

        /** @see batchGetIdMappings */
        @MustBeClosed
        fun batchGetIdMappings(
            params: WorkflowBatchGetIdMappingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseFlowIdWorkflowIdMappingResponse>

        /** @see batchGetIdMappings */
        @MustBeClosed
        fun batchGetIdMappings(
            apiFlowBatchMigrationInput: ApiFlowBatchMigrationInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseFlowIdWorkflowIdMappingResponse> =
            batchGetIdMappings(
                WorkflowBatchGetIdMappingsParams.builder()
                    .apiFlowBatchMigrationInput(apiFlowBatchMigrationInput)
                    .build(),
                requestOptions,
            )

        /** @see batchGetIdMappings */
        @MustBeClosed
        fun batchGetIdMappings(
            apiFlowBatchMigrationInput: ApiFlowBatchMigrationInput
        ): HttpResponseFor<BatchResponseFlowIdWorkflowIdMappingResponse> =
            batchGetIdMappings(apiFlowBatchMigrationInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /automation/v4/flows/{flowId}`, but is otherwise the
         * same as [WorkflowService.get].
         */
        @MustBeClosed
        fun get(flowId: String): HttpResponseFor<ApiFlow> = get(flowId, WorkflowGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            flowId: String,
            params: WorkflowGetParams = WorkflowGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiFlow> = get(params.toBuilder().flowId(flowId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            flowId: String,
            params: WorkflowGetParams = WorkflowGetParams.none(),
        ): HttpResponseFor<ApiFlow> = get(flowId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: WorkflowGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiFlow>

        /** @see get */
        @MustBeClosed
        fun get(params: WorkflowGetParams): HttpResponseFor<ApiFlow> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(flowId: String, requestOptions: RequestOptions): HttpResponseFor<ApiFlow> =
            get(flowId, WorkflowGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /automation/v4/flows/email-campaigns`, but is
         * otherwise the same as [WorkflowService.listEmailCampaigns].
         */
        @MustBeClosed
        fun listEmailCampaigns(): HttpResponseFor<CollectionResponseApiFlowEmailCampaign> =
            listEmailCampaigns(WorkflowListEmailCampaignsParams.none())

        /** @see listEmailCampaigns */
        @MustBeClosed
        fun listEmailCampaigns(
            params: WorkflowListEmailCampaignsParams = WorkflowListEmailCampaignsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseApiFlowEmailCampaign>

        /** @see listEmailCampaigns */
        @MustBeClosed
        fun listEmailCampaigns(
            params: WorkflowListEmailCampaignsParams = WorkflowListEmailCampaignsParams.none()
        ): HttpResponseFor<CollectionResponseApiFlowEmailCampaign> =
            listEmailCampaigns(params, RequestOptions.none())

        /** @see listEmailCampaigns */
        @MustBeClosed
        fun listEmailCampaigns(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseApiFlowEmailCampaign> =
            listEmailCampaigns(WorkflowListEmailCampaignsParams.none(), requestOptions)
    }
}
