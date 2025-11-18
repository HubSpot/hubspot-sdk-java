// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.pipelines

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface StageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StageService

    /** Create a new stage within the specified pipeline. */
    fun create(pipelineId: String, params: StageCreateParams): PipelineStage =
        create(pipelineId, params, RequestOptions.none())

    /** @see create */
    fun create(
        pipelineId: String,
        params: StageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage = create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see create */
    fun create(params: StageCreateParams): PipelineStage = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: StageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage

    /** Perform a partial update on a specific stage of a pipeline. */
    fun update(stageId: String, params: StageUpdateParams): PipelineStage =
        update(stageId, params, RequestOptions.none())

    /** @see update */
    fun update(
        stageId: String,
        params: StageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage = update(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see update */
    fun update(params: StageUpdateParams): PipelineStage = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: StageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage

    /** Return all the stages associated with the pipeline identified by `{pipelineId}`. */
    fun list(pipelineId: String, params: StageListParams): CollectionResponsePipelineStageNoPaging =
        list(pipelineId, params, RequestOptions.none())

    /** @see list */
    fun list(
        pipelineId: String,
        params: StageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePipelineStageNoPaging =
        list(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see list */
    fun list(params: StageListParams): CollectionResponsePipelineStageNoPaging =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: StageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePipelineStageNoPaging

    /** Delete a specific stage from a pipeline. */
    fun delete(stageId: String, params: StageDeleteParams) =
        delete(stageId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        stageId: String,
        params: StageDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see delete */
    fun delete(params: StageDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: StageDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Retrieve a specific stage from a pipeline using its ID. */
    fun get(stageId: String, params: StageGetParams): PipelineStage =
        get(stageId, params, RequestOptions.none())

    /** @see get */
    fun get(
        stageId: String,
        params: StageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage = get(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see get */
    fun get(params: StageGetParams): PipelineStage = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: StageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage

    /**
     * Return a reverse chronological list of all mutations that have occurred on the pipeline stage
     * identified by `{stageId}`.
     */
    fun getAudit(
        stageId: String,
        params: StageGetAuditParams,
    ): CollectionResponsePublicAuditInfoNoPaging = getAudit(stageId, params, RequestOptions.none())

    /** @see getAudit */
    fun getAudit(
        stageId: String,
        params: StageGetAuditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicAuditInfoNoPaging =
        getAudit(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see getAudit */
    fun getAudit(params: StageGetAuditParams): CollectionResponsePublicAuditInfoNoPaging =
        getAudit(params, RequestOptions.none())

    /** @see getAudit */
    fun getAudit(
        params: StageGetAuditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicAuditInfoNoPaging

    /**
     * Replace all the properties of an existing pipeline stage with the values provided. The
     * updated stage will be returned in the response.
     */
    fun replace(stageId: String, params: StageReplaceParams): PipelineStage =
        replace(stageId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        stageId: String,
        params: StageReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage = replace(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see replace */
    fun replace(params: StageReplaceParams): PipelineStage = replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: StageReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage

    /** A view of [StageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/v3/pipelines/{objectType}/{pipelineId}/stages`, but is otherwise the same as
         * [StageService.create].
         */
        @MustBeClosed
        fun create(pipelineId: String, params: StageCreateParams): HttpResponseFor<PipelineStage> =
            create(pipelineId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            pipelineId: String,
            params: StageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage> =
            create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: StageCreateParams): HttpResponseFor<PipelineStage> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: StageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage>

        /**
         * Returns a raw HTTP response for `patch
         * /crm/v3/pipelines/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the same
         * as [StageService.update].
         */
        @MustBeClosed
        fun update(stageId: String, params: StageUpdateParams): HttpResponseFor<PipelineStage> =
            update(stageId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            stageId: String,
            params: StageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage> =
            update(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: StageUpdateParams): HttpResponseFor<PipelineStage> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: StageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage>

        /**
         * Returns a raw HTTP response for `get /crm/v3/pipelines/{objectType}/{pipelineId}/stages`,
         * but is otherwise the same as [StageService.list].
         */
        @MustBeClosed
        fun list(
            pipelineId: String,
            params: StageListParams,
        ): HttpResponseFor<CollectionResponsePipelineStageNoPaging> =
            list(pipelineId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            pipelineId: String,
            params: StageListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePipelineStageNoPaging> =
            list(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: StageListParams
        ): HttpResponseFor<CollectionResponsePipelineStageNoPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: StageListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePipelineStageNoPaging>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/v3/pipelines/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the same
         * as [StageService.delete].
         */
        @MustBeClosed
        fun delete(stageId: String, params: StageDeleteParams): HttpResponse =
            delete(stageId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            stageId: String,
            params: StageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: StageDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: StageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/pipelines/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the same
         * as [StageService.get].
         */
        @MustBeClosed
        fun get(stageId: String, params: StageGetParams): HttpResponseFor<PipelineStage> =
            get(stageId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            stageId: String,
            params: StageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage> =
            get(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: StageGetParams): HttpResponseFor<PipelineStage> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: StageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage>

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/pipelines/{objectType}/{pipelineId}/stages/{stageId}/audit`, but is otherwise the
         * same as [StageService.getAudit].
         */
        @MustBeClosed
        fun getAudit(
            stageId: String,
            params: StageGetAuditParams,
        ): HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging> =
            getAudit(stageId, params, RequestOptions.none())

        /** @see getAudit */
        @MustBeClosed
        fun getAudit(
            stageId: String,
            params: StageGetAuditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging> =
            getAudit(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see getAudit */
        @MustBeClosed
        fun getAudit(
            params: StageGetAuditParams
        ): HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging> =
            getAudit(params, RequestOptions.none())

        /** @see getAudit */
        @MustBeClosed
        fun getAudit(
            params: StageGetAuditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>

        /**
         * Returns a raw HTTP response for `put
         * /crm/v3/pipelines/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the same
         * as [StageService.replace].
         */
        @MustBeClosed
        fun replace(stageId: String, params: StageReplaceParams): HttpResponseFor<PipelineStage> =
            replace(stageId, params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            stageId: String,
            params: StageReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage> =
            replace(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see replace */
        @MustBeClosed
        fun replace(params: StageReplaceParams): HttpResponseFor<PipelineStage> =
            replace(params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: StageReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage>
    }
}
