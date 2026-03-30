// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PipelineServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PipelineServiceAsync

    /** Create a pipeline stage */
    fun create(pipelineId: String, params: PipelineCreateParams): CompletableFuture<PipelineStage> =
        create(pipelineId, params, RequestOptions.none())

    /** @see create */
    fun create(
        pipelineId: String,
        params: PipelineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage> =
        create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see create */
    fun create(params: PipelineCreateParams): CompletableFuture<PipelineStage> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PipelineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage>

    fun update(stageId: String, params: PipelineUpdateParams): CompletableFuture<PipelineStage> =
        update(stageId, params, RequestOptions.none())

    /** @see update */
    fun update(
        stageId: String,
        params: PipelineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage> =
        update(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see update */
    fun update(params: PipelineUpdateParams): CompletableFuture<PipelineStage> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PipelineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage>

    /** Return all the stages associated with the pipeline identified by `{pipelineId}`. */
    fun list(
        pipelineId: String,
        params: PipelineListParams,
    ): CompletableFuture<CollectionResponsePipelineStageNoPaging> =
        list(pipelineId, params, RequestOptions.none())

    /** @see list */
    fun list(
        pipelineId: String,
        params: PipelineListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePipelineStageNoPaging> =
        list(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see list */
    fun list(
        params: PipelineListParams
    ): CompletableFuture<CollectionResponsePipelineStageNoPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PipelineListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePipelineStageNoPaging>

    /** Delete a pipeline stage */
    fun delete(stageId: String, params: PipelineDeleteParams): CompletableFuture<Void?> =
        delete(stageId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        stageId: String,
        params: PipelineDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see delete */
    fun delete(params: PipelineDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PipelineDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Return a pipeline stage by ID */
    fun get(stageId: String, params: PipelineGetParams): CompletableFuture<PipelineStage> =
        get(stageId, params, RequestOptions.none())

    /** @see get */
    fun get(
        stageId: String,
        params: PipelineGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage> =
        get(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see get */
    fun get(params: PipelineGetParams): CompletableFuture<PipelineStage> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PipelineGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage>

    /**
     * Return a reverse chronological list of all mutations that have occurred on the pipeline stage
     * identified by `{stageId}`.
     */
    fun getAudit(
        stageId: String,
        params: PipelineGetAuditParams,
    ): CompletableFuture<CollectionResponsePublicAuditInfoNoPaging> =
        getAudit(stageId, params, RequestOptions.none())

    /** @see getAudit */
    fun getAudit(
        stageId: String,
        params: PipelineGetAuditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicAuditInfoNoPaging> =
        getAudit(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see getAudit */
    fun getAudit(
        params: PipelineGetAuditParams
    ): CompletableFuture<CollectionResponsePublicAuditInfoNoPaging> =
        getAudit(params, RequestOptions.none())

    /** @see getAudit */
    fun getAudit(
        params: PipelineGetAuditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicAuditInfoNoPaging>

    /**
     * Replace all the properties of an existing pipeline stage with the values provided. The
     * updated stage will be returned in the response.
     */
    fun replace(stageId: String, params: PipelineReplaceParams): CompletableFuture<PipelineStage> =
        replace(stageId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        stageId: String,
        params: PipelineReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage> =
        replace(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see replace */
    fun replace(params: PipelineReplaceParams): CompletableFuture<PipelineStage> =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: PipelineReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage>

    /**
     * A view of [PipelineServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PipelineServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages`, but is otherwise the same as
         * [PipelineServiceAsync.create].
         */
        fun create(
            pipelineId: String,
            params: PipelineCreateParams,
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            create(pipelineId, params, RequestOptions.none())

        /** @see create */
        fun create(
            pipelineId: String,
            params: PipelineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see create */
        fun create(
            params: PipelineCreateParams
        ): CompletableFuture<HttpResponseFor<PipelineStage>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PipelineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>>

        /**
         * Returns a raw HTTP response for `patch
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the
         * same as [PipelineServiceAsync.update].
         */
        fun update(
            stageId: String,
            params: PipelineUpdateParams,
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            update(stageId, params, RequestOptions.none())

        /** @see update */
        fun update(
            stageId: String,
            params: PipelineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            update(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see update */
        fun update(
            params: PipelineUpdateParams
        ): CompletableFuture<HttpResponseFor<PipelineStage>> = update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PipelineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>>

        /**
         * Returns a raw HTTP response for `get
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages`, but is otherwise the same as
         * [PipelineServiceAsync.list].
         */
        fun list(
            pipelineId: String,
            params: PipelineListParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineStageNoPaging>> =
            list(pipelineId, params, RequestOptions.none())

        /** @see list */
        fun list(
            pipelineId: String,
            params: PipelineListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineStageNoPaging>> =
            list(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see list */
        fun list(
            params: PipelineListParams
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineStageNoPaging>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PipelineListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineStageNoPaging>>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the
         * same as [PipelineServiceAsync.delete].
         */
        fun delete(stageId: String, params: PipelineDeleteParams): CompletableFuture<HttpResponse> =
            delete(stageId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            stageId: String,
            params: PipelineDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see delete */
        fun delete(params: PipelineDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PipelineDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the
         * same as [PipelineServiceAsync.get].
         */
        fun get(
            stageId: String,
            params: PipelineGetParams,
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            get(stageId, params, RequestOptions.none())

        /** @see get */
        fun get(
            stageId: String,
            params: PipelineGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            get(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see get */
        fun get(params: PipelineGetParams): CompletableFuture<HttpResponseFor<PipelineStage>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: PipelineGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>>

        /**
         * Returns a raw HTTP response for `get
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}/audit`, but is
         * otherwise the same as [PipelineServiceAsync.getAudit].
         */
        fun getAudit(
            stageId: String,
            params: PipelineGetAuditParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>> =
            getAudit(stageId, params, RequestOptions.none())

        /** @see getAudit */
        fun getAudit(
            stageId: String,
            params: PipelineGetAuditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>> =
            getAudit(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see getAudit */
        fun getAudit(
            params: PipelineGetAuditParams
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>> =
            getAudit(params, RequestOptions.none())

        /** @see getAudit */
        fun getAudit(
            params: PipelineGetAuditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>>

        /**
         * Returns a raw HTTP response for `put
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the
         * same as [PipelineServiceAsync.replace].
         */
        fun replace(
            stageId: String,
            params: PipelineReplaceParams,
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            replace(stageId, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            stageId: String,
            params: PipelineReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            replace(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see replace */
        fun replace(
            params: PipelineReplaceParams
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: PipelineReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>>
    }
}
