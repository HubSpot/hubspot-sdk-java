// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.pipelines.CollectionResponsePipelineStageNoPaging
import com.hubspot_sdk.api.models.crm.pipelines.CollectionResponsePublicAuditInfoNoPaging
import com.hubspot_sdk.api.models.crm.pipelines.PipelineCreateParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineDeleteParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineGetAuditParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineGetParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineListParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineReplaceParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineStage
import com.hubspot_sdk.api.models.crm.pipelines.PipelineUpdateParams
import java.util.function.Consumer

interface PipelineService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PipelineService

    /** Create a pipeline stage */
    fun create(pipelineId: String, params: PipelineCreateParams): PipelineStage =
        create(pipelineId, params, RequestOptions.none())

    /** @see create */
    fun create(
        pipelineId: String,
        params: PipelineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage = create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see create */
    fun create(params: PipelineCreateParams): PipelineStage = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PipelineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage

    fun update(stageId: String, params: PipelineUpdateParams): PipelineStage =
        update(stageId, params, RequestOptions.none())

    /** @see update */
    fun update(
        stageId: String,
        params: PipelineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage = update(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see update */
    fun update(params: PipelineUpdateParams): PipelineStage = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PipelineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage

    /** Return all the stages associated with the pipeline identified by `{pipelineId}`. */
    fun list(
        pipelineId: String,
        params: PipelineListParams,
    ): CollectionResponsePipelineStageNoPaging = list(pipelineId, params, RequestOptions.none())

    /** @see list */
    fun list(
        pipelineId: String,
        params: PipelineListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePipelineStageNoPaging =
        list(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see list */
    fun list(params: PipelineListParams): CollectionResponsePipelineStageNoPaging =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PipelineListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePipelineStageNoPaging

    /** Delete a pipeline stage */
    fun delete(stageId: String, params: PipelineDeleteParams) =
        delete(stageId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        stageId: String,
        params: PipelineDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see delete */
    fun delete(params: PipelineDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: PipelineDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Return a pipeline stage by ID */
    fun get(stageId: String, params: PipelineGetParams): PipelineStage =
        get(stageId, params, RequestOptions.none())

    /** @see get */
    fun get(
        stageId: String,
        params: PipelineGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage = get(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see get */
    fun get(params: PipelineGetParams): PipelineStage = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PipelineGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage

    /**
     * Return a reverse chronological list of all mutations that have occurred on the pipeline stage
     * identified by `{stageId}`.
     */
    fun getAudit(
        stageId: String,
        params: PipelineGetAuditParams,
    ): CollectionResponsePublicAuditInfoNoPaging = getAudit(stageId, params, RequestOptions.none())

    /** @see getAudit */
    fun getAudit(
        stageId: String,
        params: PipelineGetAuditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicAuditInfoNoPaging =
        getAudit(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see getAudit */
    fun getAudit(params: PipelineGetAuditParams): CollectionResponsePublicAuditInfoNoPaging =
        getAudit(params, RequestOptions.none())

    /** @see getAudit */
    fun getAudit(
        params: PipelineGetAuditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicAuditInfoNoPaging

    /**
     * Replace all the properties of an existing pipeline stage with the values provided. The
     * updated stage will be returned in the response.
     */
    fun replace(stageId: String, params: PipelineReplaceParams): PipelineStage =
        replace(stageId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        stageId: String,
        params: PipelineReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage = replace(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see replace */
    fun replace(params: PipelineReplaceParams): PipelineStage =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: PipelineReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineStage

    /** A view of [PipelineService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PipelineService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages`, but is otherwise the same as
         * [PipelineService.create].
         */
        @MustBeClosed
        fun create(
            pipelineId: String,
            params: PipelineCreateParams,
        ): HttpResponseFor<PipelineStage> = create(pipelineId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            pipelineId: String,
            params: PipelineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage> =
            create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: PipelineCreateParams): HttpResponseFor<PipelineStage> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PipelineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage>

        /**
         * Returns a raw HTTP response for `patch
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the
         * same as [PipelineService.update].
         */
        @MustBeClosed
        fun update(stageId: String, params: PipelineUpdateParams): HttpResponseFor<PipelineStage> =
            update(stageId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            stageId: String,
            params: PipelineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage> =
            update(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: PipelineUpdateParams): HttpResponseFor<PipelineStage> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PipelineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage>

        /**
         * Returns a raw HTTP response for `get
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages`, but is otherwise the same as
         * [PipelineService.list].
         */
        @MustBeClosed
        fun list(
            pipelineId: String,
            params: PipelineListParams,
        ): HttpResponseFor<CollectionResponsePipelineStageNoPaging> =
            list(pipelineId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            pipelineId: String,
            params: PipelineListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePipelineStageNoPaging> =
            list(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: PipelineListParams
        ): HttpResponseFor<CollectionResponsePipelineStageNoPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PipelineListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePipelineStageNoPaging>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the
         * same as [PipelineService.delete].
         */
        @MustBeClosed
        fun delete(stageId: String, params: PipelineDeleteParams): HttpResponse =
            delete(stageId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            stageId: String,
            params: PipelineDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: PipelineDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PipelineDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the
         * same as [PipelineService.get].
         */
        @MustBeClosed
        fun get(stageId: String, params: PipelineGetParams): HttpResponseFor<PipelineStage> =
            get(stageId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            stageId: String,
            params: PipelineGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage> =
            get(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: PipelineGetParams): HttpResponseFor<PipelineStage> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: PipelineGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage>

        /**
         * Returns a raw HTTP response for `get
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}/audit`, but is
         * otherwise the same as [PipelineService.getAudit].
         */
        @MustBeClosed
        fun getAudit(
            stageId: String,
            params: PipelineGetAuditParams,
        ): HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging> =
            getAudit(stageId, params, RequestOptions.none())

        /** @see getAudit */
        @MustBeClosed
        fun getAudit(
            stageId: String,
            params: PipelineGetAuditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging> =
            getAudit(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see getAudit */
        @MustBeClosed
        fun getAudit(
            params: PipelineGetAuditParams
        ): HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging> =
            getAudit(params, RequestOptions.none())

        /** @see getAudit */
        @MustBeClosed
        fun getAudit(
            params: PipelineGetAuditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>

        /**
         * Returns a raw HTTP response for `put
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the
         * same as [PipelineService.replace].
         */
        @MustBeClosed
        fun replace(
            stageId: String,
            params: PipelineReplaceParams,
        ): HttpResponseFor<PipelineStage> = replace(stageId, params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            stageId: String,
            params: PipelineReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage> =
            replace(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see replace */
        @MustBeClosed
        fun replace(params: PipelineReplaceParams): HttpResponseFor<PipelineStage> =
            replace(params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: PipelineReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineStage>
    }
}
