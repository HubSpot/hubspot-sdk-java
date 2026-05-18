// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages.sitepages

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.AbTestCreateRequestVNext
import com.hubspot.sdk.models.cms.pages.AbTestEndRequestVNext
import com.hubspot.sdk.models.cms.pages.AbTestRerunRequestVNext
import com.hubspot.sdk.models.cms.pages.PagesPage
import com.hubspot.sdk.models.cms.pages.sitepages.abtest.AbTestCreateSitePageVariationParams
import com.hubspot.sdk.models.cms.pages.sitepages.abtest.AbTestEndSitePageTestParams
import com.hubspot.sdk.models.cms.pages.sitepages.abtest.AbTestRerunSitePageTestParams
import java.util.function.Consumer

interface AbTestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AbTestService

    /** Create a new A/B test variation based on the information provided in the request body. */
    fun createSitePageVariation(params: AbTestCreateSitePageVariationParams): PagesPage =
        createSitePageVariation(params, RequestOptions.none())

    /** @see createSitePageVariation */
    fun createSitePageVariation(
        params: AbTestCreateSitePageVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage

    /** @see createSitePageVariation */
    fun createSitePageVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage =
        createSitePageVariation(
            AbTestCreateSitePageVariationParams.builder()
                .abTestCreateRequestVNext(abTestCreateRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createSitePageVariation */
    fun createSitePageVariation(abTestCreateRequestVNext: AbTestCreateRequestVNext): PagesPage =
        createSitePageVariation(abTestCreateRequestVNext, RequestOptions.none())

    /** End an active A/B test and designate a winner. */
    fun endSitePageTest(params: AbTestEndSitePageTestParams) =
        endSitePageTest(params, RequestOptions.none())

    /** @see endSitePageTest */
    fun endSitePageTest(
        params: AbTestEndSitePageTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see endSitePageTest */
    fun endSitePageTest(
        abTestEndRequestVNext: AbTestEndRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        endSitePageTest(
            AbTestEndSitePageTestParams.builder()
                .abTestEndRequestVNext(abTestEndRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see endSitePageTest */
    fun endSitePageTest(abTestEndRequestVNext: AbTestEndRequestVNext) =
        endSitePageTest(abTestEndRequestVNext, RequestOptions.none())

    /** Rerun a previous A/B test. */
    fun rerunSitePageTest(params: AbTestRerunSitePageTestParams) =
        rerunSitePageTest(params, RequestOptions.none())

    /** @see rerunSitePageTest */
    fun rerunSitePageTest(
        params: AbTestRerunSitePageTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see rerunSitePageTest */
    fun rerunSitePageTest(
        abTestRerunRequestVNext: AbTestRerunRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        rerunSitePageTest(
            AbTestRerunSitePageTestParams.builder()
                .abTestRerunRequestVNext(abTestRerunRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see rerunSitePageTest */
    fun rerunSitePageTest(abTestRerunRequestVNext: AbTestRerunRequestVNext) =
        rerunSitePageTest(abTestRerunRequestVNext, RequestOptions.none())

    /** A view of [AbTestService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AbTestService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/ab-test/create-variation`, but is otherwise the same as
         * [AbTestService.createSitePageVariation].
         */
        @MustBeClosed
        fun createSitePageVariation(
            params: AbTestCreateSitePageVariationParams
        ): HttpResponseFor<PagesPage> = createSitePageVariation(params, RequestOptions.none())

        /** @see createSitePageVariation */
        @MustBeClosed
        fun createSitePageVariation(
            params: AbTestCreateSitePageVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage>

        /** @see createSitePageVariation */
        @MustBeClosed
        fun createSitePageVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage> =
            createSitePageVariation(
                AbTestCreateSitePageVariationParams.builder()
                    .abTestCreateRequestVNext(abTestCreateRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createSitePageVariation */
        @MustBeClosed
        fun createSitePageVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext
        ): HttpResponseFor<PagesPage> =
            createSitePageVariation(abTestCreateRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/ab-test/end`, but is
         * otherwise the same as [AbTestService.endSitePageTest].
         */
        @MustBeClosed
        fun endSitePageTest(params: AbTestEndSitePageTestParams): HttpResponse =
            endSitePageTest(params, RequestOptions.none())

        /** @see endSitePageTest */
        @MustBeClosed
        fun endSitePageTest(
            params: AbTestEndSitePageTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see endSitePageTest */
        @MustBeClosed
        fun endSitePageTest(
            abTestEndRequestVNext: AbTestEndRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            endSitePageTest(
                AbTestEndSitePageTestParams.builder()
                    .abTestEndRequestVNext(abTestEndRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see endSitePageTest */
        @MustBeClosed
        fun endSitePageTest(abTestEndRequestVNext: AbTestEndRequestVNext): HttpResponse =
            endSitePageTest(abTestEndRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/ab-test/rerun`, but
         * is otherwise the same as [AbTestService.rerunSitePageTest].
         */
        @MustBeClosed
        fun rerunSitePageTest(params: AbTestRerunSitePageTestParams): HttpResponse =
            rerunSitePageTest(params, RequestOptions.none())

        /** @see rerunSitePageTest */
        @MustBeClosed
        fun rerunSitePageTest(
            params: AbTestRerunSitePageTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see rerunSitePageTest */
        @MustBeClosed
        fun rerunSitePageTest(
            abTestRerunRequestVNext: AbTestRerunRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            rerunSitePageTest(
                AbTestRerunSitePageTestParams.builder()
                    .abTestRerunRequestVNext(abTestRerunRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see rerunSitePageTest */
        @MustBeClosed
        fun rerunSitePageTest(abTestRerunRequestVNext: AbTestRerunRequestVNext): HttpResponse =
            rerunSitePageTest(abTestRerunRequestVNext, RequestOptions.none())
    }
}
