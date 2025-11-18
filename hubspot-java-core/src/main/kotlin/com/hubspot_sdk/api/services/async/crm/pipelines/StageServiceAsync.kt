// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.pipelines

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.pipelines.CollectionResponsePipelineStageNoPaging
import com.hubspot_sdk.api.models.crm.pipelines.CollectionResponsePublicAuditInfoNoPaging
import com.hubspot_sdk.api.models.crm.pipelines.PipelineStage
import com.hubspot_sdk.api.models.crm.pipelines.stages.StageCreateParams
import com.hubspot_sdk.api.models.crm.pipelines.stages.StageDeleteParams
import com.hubspot_sdk.api.models.crm.pipelines.stages.StageGetAuditParams
import com.hubspot_sdk.api.models.crm.pipelines.stages.StageGetParams
import com.hubspot_sdk.api.models.crm.pipelines.stages.StageListParams
import com.hubspot_sdk.api.models.crm.pipelines.stages.StageReplaceParams
import com.hubspot_sdk.api.models.crm.pipelines.stages.StageUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface StageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StageServiceAsync

    /** Create a new stage within the specified pipeline. */
    fun create(pipelineId: String, params: StageCreateParams): CompletableFuture<PipelineStage> =
        create(pipelineId, params, RequestOptions.none())

    /** @see create */
    fun create(
        pipelineId: String,
        params: StageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage> =
        create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see create */
    fun create(params: StageCreateParams): CompletableFuture<PipelineStage> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: StageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage>

    /** Perform a partial update on a specific stage of a pipeline. */
    fun update(stageId: String, params: StageUpdateParams): CompletableFuture<PipelineStage> =
        update(stageId, params, RequestOptions.none())

    /** @see update */
    fun update(
        stageId: String,
        params: StageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage> =
        update(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see update */
    fun update(params: StageUpdateParams): CompletableFuture<PipelineStage> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: StageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage>

    /** Return all the stages associated with the pipeline identified by `{pipelineId}`. */
    fun list(
        pipelineId: String,
        params: StageListParams,
    ): CompletableFuture<CollectionResponsePipelineStageNoPaging> =
        list(pipelineId, params, RequestOptions.none())

    /** @see list */
    fun list(
        pipelineId: String,
        params: StageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePipelineStageNoPaging> =
        list(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see list */
    fun list(params: StageListParams): CompletableFuture<CollectionResponsePipelineStageNoPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: StageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePipelineStageNoPaging>

    /** Delete a specific stage from a pipeline. */
    fun delete(stageId: String, params: StageDeleteParams): CompletableFuture<Void?> =
        delete(stageId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        stageId: String,
        params: StageDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see delete */
    fun delete(params: StageDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: StageDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Retrieve a specific stage from a pipeline using its ID. */
    fun get(stageId: String, params: StageGetParams): CompletableFuture<PipelineStage> =
        get(stageId, params, RequestOptions.none())

    /** @see get */
    fun get(
        stageId: String,
        params: StageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage> =
        get(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see get */
    fun get(params: StageGetParams): CompletableFuture<PipelineStage> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: StageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage>

    /**
     * Return a reverse chronological list of all mutations that have occurred on the pipeline stage
     * identified by `{stageId}`.
     */
    fun getAudit(
        stageId: String,
        params: StageGetAuditParams,
    ): CompletableFuture<CollectionResponsePublicAuditInfoNoPaging> =
        getAudit(stageId, params, RequestOptions.none())

    /** @see getAudit */
    fun getAudit(
        stageId: String,
        params: StageGetAuditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicAuditInfoNoPaging> =
        getAudit(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see getAudit */
    fun getAudit(
        params: StageGetAuditParams
    ): CompletableFuture<CollectionResponsePublicAuditInfoNoPaging> =
        getAudit(params, RequestOptions.none())

    /** @see getAudit */
    fun getAudit(
        params: StageGetAuditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicAuditInfoNoPaging>

    /**
     * Replace all the properties of an existing pipeline stage with the values provided. The
     * updated stage will be returned in the response.
     */
    fun replace(stageId: String, params: StageReplaceParams): CompletableFuture<PipelineStage> =
        replace(stageId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        stageId: String,
        params: StageReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage> =
        replace(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see replace */
    fun replace(params: StageReplaceParams): CompletableFuture<PipelineStage> =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: StageReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage>

    /** A view of [StageServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/v3/pipelines/{objectType}/{pipelineId}/stages`, but is otherwise the same as
         * [StageServiceAsync.create].
         */
        fun create(
            pipelineId: String,
            params: StageCreateParams,
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            create(pipelineId, params, RequestOptions.none())

        /** @see create */
        fun create(
            pipelineId: String,
            params: StageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see create */
        fun create(params: StageCreateParams): CompletableFuture<HttpResponseFor<PipelineStage>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: StageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>>

        /**
         * Returns a raw HTTP response for `patch
         * /crm/v3/pipelines/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the same
         * as [StageServiceAsync.update].
         */
        fun update(
            stageId: String,
            params: StageUpdateParams,
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            update(stageId, params, RequestOptions.none())

        /** @see update */
        fun update(
            stageId: String,
            params: StageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            update(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see update */
        fun update(params: StageUpdateParams): CompletableFuture<HttpResponseFor<PipelineStage>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: StageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>>

        /**
         * Returns a raw HTTP response for `get /crm/v3/pipelines/{objectType}/{pipelineId}/stages`,
         * but is otherwise the same as [StageServiceAsync.list].
         */
        fun list(
            pipelineId: String,
            params: StageListParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineStageNoPaging>> =
            list(pipelineId, params, RequestOptions.none())

        /** @see list */
        fun list(
            pipelineId: String,
            params: StageListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineStageNoPaging>> =
            list(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see list */
        fun list(
            params: StageListParams
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineStageNoPaging>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: StageListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineStageNoPaging>>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/v3/pipelines/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the same
         * as [StageServiceAsync.delete].
         */
        fun delete(stageId: String, params: StageDeleteParams): CompletableFuture<HttpResponse> =
            delete(stageId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            stageId: String,
            params: StageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see delete */
        fun delete(params: StageDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: StageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/pipelines/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the same
         * as [StageServiceAsync.get].
         */
        fun get(
            stageId: String,
            params: StageGetParams,
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            get(stageId, params, RequestOptions.none())

        /** @see get */
        fun get(
            stageId: String,
            params: StageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            get(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see get */
        fun get(params: StageGetParams): CompletableFuture<HttpResponseFor<PipelineStage>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: StageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>>

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/pipelines/{objectType}/{pipelineId}/stages/{stageId}/audit`, but is otherwise the
         * same as [StageServiceAsync.getAudit].
         */
        fun getAudit(
            stageId: String,
            params: StageGetAuditParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>> =
            getAudit(stageId, params, RequestOptions.none())

        /** @see getAudit */
        fun getAudit(
            stageId: String,
            params: StageGetAuditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>> =
            getAudit(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see getAudit */
        fun getAudit(
            params: StageGetAuditParams
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>> =
            getAudit(params, RequestOptions.none())

        /** @see getAudit */
        fun getAudit(
            params: StageGetAuditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>>

        /**
         * Returns a raw HTTP response for `put
         * /crm/v3/pipelines/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the same
         * as [StageServiceAsync.replace].
         */
        fun replace(
            stageId: String,
            params: StageReplaceParams,
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            replace(stageId, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            stageId: String,
            params: StageReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            replace(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see replace */
        fun replace(params: StageReplaceParams): CompletableFuture<HttpResponseFor<PipelineStage>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: StageReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>>
    }
}
