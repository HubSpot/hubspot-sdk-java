// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.datastudio

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.datastudio.datasource.DataSourceGetResponse
import com.hubspot_sdk.api.models.datastudio.datasource.DataSourceUpdateResponse
import com.hubspot_sdk.api.models.datastudio.datasource.DatasourceCreateParams
import com.hubspot_sdk.api.models.datastudio.datasource.DatasourceDeleteParams
import com.hubspot_sdk.api.models.datastudio.datasource.DatasourceGetParams
import com.hubspot_sdk.api.models.datastudio.datasource.DatasourceUpdateParams
import com.hubspot_sdk.api.models.datastudio.datasource.FormDataMultiPart
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DatasourceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatasourceServiceAsync

    fun create(params: DatasourceCreateParams): CompletableFuture<HttpResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DatasourceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see create */
    fun create(
        formDataMultiPart: FormDataMultiPart,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        create(
            DatasourceCreateParams.builder().formDataMultiPart(formDataMultiPart).build(),
            requestOptions,
        )

    /** @see create */
    fun create(formDataMultiPart: FormDataMultiPart): CompletableFuture<HttpResponse> =
        create(formDataMultiPart, RequestOptions.none())

    fun update(
        datasourceId: Long,
        params: DatasourceUpdateParams,
    ): CompletableFuture<DataSourceUpdateResponse> =
        update(datasourceId, params, RequestOptions.none())

    /** @see update */
    fun update(
        datasourceId: Long,
        params: DatasourceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataSourceUpdateResponse> =
        update(params.toBuilder().datasourceId(datasourceId).build(), requestOptions)

    /** @see update */
    fun update(params: DatasourceUpdateParams): CompletableFuture<DataSourceUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DatasourceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataSourceUpdateResponse>

    fun delete(datasourceId: Long): CompletableFuture<HttpResponse> =
        delete(datasourceId, DatasourceDeleteParams.none())

    /** @see delete */
    fun delete(
        datasourceId: Long,
        params: DatasourceDeleteParams = DatasourceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        delete(params.toBuilder().datasourceId(datasourceId).build(), requestOptions)

    /** @see delete */
    fun delete(
        datasourceId: Long,
        params: DatasourceDeleteParams = DatasourceDeleteParams.none(),
    ): CompletableFuture<HttpResponse> = delete(datasourceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DatasourceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see delete */
    fun delete(params: DatasourceDeleteParams): CompletableFuture<HttpResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        datasourceId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        delete(datasourceId, DatasourceDeleteParams.none(), requestOptions)

    fun get(datasourceId: Long): CompletableFuture<DataSourceGetResponse> =
        get(datasourceId, DatasourceGetParams.none())

    /** @see get */
    fun get(
        datasourceId: Long,
        params: DatasourceGetParams = DatasourceGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataSourceGetResponse> =
        get(params.toBuilder().datasourceId(datasourceId).build(), requestOptions)

    /** @see get */
    fun get(
        datasourceId: Long,
        params: DatasourceGetParams = DatasourceGetParams.none(),
    ): CompletableFuture<DataSourceGetResponse> = get(datasourceId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DatasourceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataSourceGetResponse>

    /** @see get */
    fun get(params: DatasourceGetParams): CompletableFuture<DataSourceGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        datasourceId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataSourceGetResponse> =
        get(datasourceId, DatasourceGetParams.none(), requestOptions)

    /**
     * A view of [DatasourceServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DatasourceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /data-studio/2026-03/data-source`, but is otherwise
         * the same as [DatasourceServiceAsync.create].
         */
        fun create(params: DatasourceCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DatasourceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see create */
        fun create(
            formDataMultiPart: FormDataMultiPart,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            create(
                DatasourceCreateParams.builder().formDataMultiPart(formDataMultiPart).build(),
                requestOptions,
            )

        /** @see create */
        fun create(formDataMultiPart: FormDataMultiPart): CompletableFuture<HttpResponse> =
            create(formDataMultiPart, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /data-studio/2026-03/data-source/{datasourceId}`,
         * but is otherwise the same as [DatasourceServiceAsync.update].
         */
        fun update(
            datasourceId: Long,
            params: DatasourceUpdateParams,
        ): CompletableFuture<HttpResponseFor<DataSourceUpdateResponse>> =
            update(datasourceId, params, RequestOptions.none())

        /** @see update */
        fun update(
            datasourceId: Long,
            params: DatasourceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataSourceUpdateResponse>> =
            update(params.toBuilder().datasourceId(datasourceId).build(), requestOptions)

        /** @see update */
        fun update(
            params: DatasourceUpdateParams
        ): CompletableFuture<HttpResponseFor<DataSourceUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DatasourceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataSourceUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete /data-studio/2026-03/data-source/{datasourceId}`,
         * but is otherwise the same as [DatasourceServiceAsync.delete].
         */
        fun delete(datasourceId: Long): CompletableFuture<HttpResponse> =
            delete(datasourceId, DatasourceDeleteParams.none())

        /** @see delete */
        fun delete(
            datasourceId: Long,
            params: DatasourceDeleteParams = DatasourceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().datasourceId(datasourceId).build(), requestOptions)

        /** @see delete */
        fun delete(
            datasourceId: Long,
            params: DatasourceDeleteParams = DatasourceDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(datasourceId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DatasourceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: DatasourceDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            datasourceId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(datasourceId, DatasourceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /data-studio/2026-03/data-source/{datasourceId}`,
         * but is otherwise the same as [DatasourceServiceAsync.get].
         */
        fun get(datasourceId: Long): CompletableFuture<HttpResponseFor<DataSourceGetResponse>> =
            get(datasourceId, DatasourceGetParams.none())

        /** @see get */
        fun get(
            datasourceId: Long,
            params: DatasourceGetParams = DatasourceGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataSourceGetResponse>> =
            get(params.toBuilder().datasourceId(datasourceId).build(), requestOptions)

        /** @see get */
        fun get(
            datasourceId: Long,
            params: DatasourceGetParams = DatasourceGetParams.none(),
        ): CompletableFuture<HttpResponseFor<DataSourceGetResponse>> =
            get(datasourceId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: DatasourceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataSourceGetResponse>>

        /** @see get */
        fun get(
            params: DatasourceGetParams
        ): CompletableFuture<HttpResponseFor<DataSourceGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            datasourceId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataSourceGetResponse>> =
            get(datasourceId, DatasourceGetParams.none(), requestOptions)
    }
}
