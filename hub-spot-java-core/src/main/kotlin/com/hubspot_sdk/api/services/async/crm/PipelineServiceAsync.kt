// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.pipelines.CollectionResponsePipelineNoPaging
import com.hubspot_sdk.api.models.crm.pipelines.CollectionResponsePublicAuditInfoNoPaging
import com.hubspot_sdk.api.models.crm.pipelines.Pipeline
import com.hubspot_sdk.api.models.crm.pipelines.PipelineCreateParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineDeleteParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineGetAuditParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineGetParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineListParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineReplaceParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineUpdateParams
import com.hubspot_sdk.api.services.async.crm.pipelines.StageServiceAsync
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

    fun stages(): StageServiceAsync

    /**
     * Create a new pipeline with the provided property values. The entire pipeline object,
     * including its unique ID, will be returned in the response.
     */
    fun create(objectType: String, params: PipelineCreateParams): CompletableFuture<Pipeline> =
        create(objectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        objectType: String,
        params: PipelineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline> =
        create(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see create */
    fun create(params: PipelineCreateParams): CompletableFuture<Pipeline> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PipelineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline>

    /**
     * Perform a partial update of the pipeline identified by `{pipelineId}`. The updated pipeline
     * will be returned in the response.
     */
    fun update(pipelineId: String, params: PipelineUpdateParams): CompletableFuture<Pipeline> =
        update(pipelineId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pipelineId: String,
        params: PipelineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline> =
        update(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see update */
    fun update(params: PipelineUpdateParams): CompletableFuture<Pipeline> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PipelineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline>

    /** Return all pipelines for the object type specified by `{objectType}`. */
    fun list(objectType: String): CompletableFuture<CollectionResponsePipelineNoPaging> =
        list(objectType, PipelineListParams.none())

    /** @see list */
    fun list(
        objectType: String,
        params: PipelineListParams = PipelineListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePipelineNoPaging> =
        list(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see list */
    fun list(
        objectType: String,
        params: PipelineListParams = PipelineListParams.none(),
    ): CompletableFuture<CollectionResponsePipelineNoPaging> =
        list(objectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PipelineListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePipelineNoPaging>

    /** @see list */
    fun list(params: PipelineListParams): CompletableFuture<CollectionResponsePipelineNoPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        objectType: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePipelineNoPaging> =
        list(objectType, PipelineListParams.none(), requestOptions)

    /** Delete the pipeline identified by `{pipelineId}`. */
    fun delete(pipelineId: String, params: PipelineDeleteParams): CompletableFuture<Void?> =
        delete(pipelineId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        pipelineId: String,
        params: PipelineDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see delete */
    fun delete(params: PipelineDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PipelineDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Return a single pipeline object identified by its unique `{pipelineId}`. */
    fun get(pipelineId: String, params: PipelineGetParams): CompletableFuture<Pipeline> =
        get(pipelineId, params, RequestOptions.none())

    /** @see get */
    fun get(
        pipelineId: String,
        params: PipelineGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline> =
        get(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see get */
    fun get(params: PipelineGetParams): CompletableFuture<Pipeline> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PipelineGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline>

    /**
     * Return a reverse chronological list of all mutations that have occurred on the pipeline
     * identified by `{pipelineId}`.
     */
    fun getAudit(
        pipelineId: String,
        params: PipelineGetAuditParams,
    ): CompletableFuture<CollectionResponsePublicAuditInfoNoPaging> =
        getAudit(pipelineId, params, RequestOptions.none())

    /** @see getAudit */
    fun getAudit(
        pipelineId: String,
        params: PipelineGetAuditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicAuditInfoNoPaging> =
        getAudit(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

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
     * Replace all the properties of an existing pipeline with the values provided. This will
     * overwrite any existing pipeline stages. The updated pipeline will be returned in the
     * response.
     */
    fun replace(pipelineId: String, params: PipelineReplaceParams): CompletableFuture<Pipeline> =
        replace(pipelineId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        pipelineId: String,
        params: PipelineReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline> =
        replace(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see replace */
    fun replace(params: PipelineReplaceParams): CompletableFuture<Pipeline> =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: PipelineReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline>

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

        fun stages(): StageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/pipelines/{objectType}`, but is otherwise
         * the same as [PipelineServiceAsync.create].
         */
        fun create(
            objectType: String,
            params: PipelineCreateParams,
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            create(objectType, params, RequestOptions.none())

        /** @see create */
        fun create(
            objectType: String,
            params: PipelineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            create(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see create */
        fun create(params: PipelineCreateParams): CompletableFuture<HttpResponseFor<Pipeline>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PipelineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>>

        /**
         * Returns a raw HTTP response for `patch /crm/v3/pipelines/{objectType}/{pipelineId}`, but
         * is otherwise the same as [PipelineServiceAsync.update].
         */
        fun update(
            pipelineId: String,
            params: PipelineUpdateParams,
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            update(pipelineId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pipelineId: String,
            params: PipelineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            update(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see update */
        fun update(params: PipelineUpdateParams): CompletableFuture<HttpResponseFor<Pipeline>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PipelineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>>

        /**
         * Returns a raw HTTP response for `get /crm/v3/pipelines/{objectType}`, but is otherwise
         * the same as [PipelineServiceAsync.list].
         */
        fun list(
            objectType: String
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineNoPaging>> =
            list(objectType, PipelineListParams.none())

        /** @see list */
        fun list(
            objectType: String,
            params: PipelineListParams = PipelineListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineNoPaging>> =
            list(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see list */
        fun list(
            objectType: String,
            params: PipelineListParams = PipelineListParams.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineNoPaging>> =
            list(objectType, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PipelineListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineNoPaging>>

        /** @see list */
        fun list(
            params: PipelineListParams
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineNoPaging>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            objectType: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineNoPaging>> =
            list(objectType, PipelineListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/v3/pipelines/{objectType}/{pipelineId}`, but
         * is otherwise the same as [PipelineServiceAsync.delete].
         */
        fun delete(
            pipelineId: String,
            params: PipelineDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(pipelineId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            pipelineId: String,
            params: PipelineDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see delete */
        fun delete(params: PipelineDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PipelineDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /crm/v3/pipelines/{objectType}/{pipelineId}`, but is
         * otherwise the same as [PipelineServiceAsync.get].
         */
        fun get(
            pipelineId: String,
            params: PipelineGetParams,
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            get(pipelineId, params, RequestOptions.none())

        /** @see get */
        fun get(
            pipelineId: String,
            params: PipelineGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            get(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see get */
        fun get(params: PipelineGetParams): CompletableFuture<HttpResponseFor<Pipeline>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: PipelineGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>>

        /**
         * Returns a raw HTTP response for `get /crm/v3/pipelines/{objectType}/{pipelineId}/audit`,
         * but is otherwise the same as [PipelineServiceAsync.getAudit].
         */
        fun getAudit(
            pipelineId: String,
            params: PipelineGetAuditParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>> =
            getAudit(pipelineId, params, RequestOptions.none())

        /** @see getAudit */
        fun getAudit(
            pipelineId: String,
            params: PipelineGetAuditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>> =
            getAudit(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

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
         * Returns a raw HTTP response for `put /crm/v3/pipelines/{objectType}/{pipelineId}`, but is
         * otherwise the same as [PipelineServiceAsync.replace].
         */
        fun replace(
            pipelineId: String,
            params: PipelineReplaceParams,
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            replace(pipelineId, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            pipelineId: String,
            params: PipelineReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            replace(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see replace */
        fun replace(params: PipelineReplaceParams): CompletableFuture<HttpResponseFor<Pipeline>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: PipelineReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>>
    }
}
