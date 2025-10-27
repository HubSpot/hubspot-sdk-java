// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation.actions

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.automation.actions.PublicActionRevision
import com.hubspot_sdk.api.models.automation.actions.revisions.RevisionListPageAsync
import com.hubspot_sdk.api.models.automation.actions.revisions.RevisionListParams
import com.hubspot_sdk.api.models.automation.actions.revisions.RevisionReadParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RevisionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RevisionServiceAsync

    /** Retrieve the versions of a definition by ID. */
    fun list(
        definitionId: String,
        params: RevisionListParams,
    ): CompletableFuture<RevisionListPageAsync> = list(definitionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        definitionId: String,
        params: RevisionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RevisionListPageAsync> =
        list(params.toBuilder().definitionId(definitionId).build(), requestOptions)

    /** @see list */
    fun list(params: RevisionListParams): CompletableFuture<RevisionListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RevisionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RevisionListPageAsync>

    /** Retrieve a specific revision of a definition by revision ID. */
    fun read(
        revisionId: String,
        params: RevisionReadParams,
    ): CompletableFuture<PublicActionRevision> = read(revisionId, params, RequestOptions.none())

    /** @see read */
    fun read(
        revisionId: String,
        params: RevisionReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionRevision> =
        read(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see read */
    fun read(params: RevisionReadParams): CompletableFuture<PublicActionRevision> =
        read(params, RequestOptions.none())

    /** @see read */
    fun read(
        params: RevisionReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActionRevision>

    /**
     * A view of [RevisionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RevisionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /automation/v4/actions/{appId}/{definitionId}/revisions`, but is otherwise the same as
         * [RevisionServiceAsync.list].
         */
        fun list(
            definitionId: String,
            params: RevisionListParams,
        ): CompletableFuture<HttpResponseFor<RevisionListPageAsync>> =
            list(definitionId, params, RequestOptions.none())

        /** @see list */
        fun list(
            definitionId: String,
            params: RevisionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RevisionListPageAsync>> =
            list(params.toBuilder().definitionId(definitionId).build(), requestOptions)

        /** @see list */
        fun list(
            params: RevisionListParams
        ): CompletableFuture<HttpResponseFor<RevisionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RevisionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RevisionListPageAsync>>

        /**
         * Returns a raw HTTP response for `get
         * /automation/v4/actions/{appId}/{definitionId}/revisions/{revisionId}`, but is otherwise
         * the same as [RevisionServiceAsync.read].
         */
        fun read(
            revisionId: String,
            params: RevisionReadParams,
        ): CompletableFuture<HttpResponseFor<PublicActionRevision>> =
            read(revisionId, params, RequestOptions.none())

        /** @see read */
        fun read(
            revisionId: String,
            params: RevisionReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionRevision>> =
            read(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see read */
        fun read(
            params: RevisionReadParams
        ): CompletableFuture<HttpResponseFor<PublicActionRevision>> =
            read(params, RequestOptions.none())

        /** @see read */
        fun read(
            params: RevisionReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActionRevision>>
    }
}
