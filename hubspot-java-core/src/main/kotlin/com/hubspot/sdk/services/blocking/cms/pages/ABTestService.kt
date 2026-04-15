// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.AbTestCreateRequestVNext
import com.hubspot.sdk.models.cms.pages.AbTestEndRequestVNext
import com.hubspot.sdk.models.cms.pages.AbTestRerunRequestVNext
import com.hubspot.sdk.models.cms.pages.PageData
import com.hubspot.sdk.models.cms.pages.abtests.ABTestCreateLandingPageVariationParams
import com.hubspot.sdk.models.cms.pages.abtests.ABTestCreateSitePageVariationParams
import com.hubspot.sdk.models.cms.pages.abtests.ABTestEndLandingPageTestParams
import com.hubspot.sdk.models.cms.pages.abtests.ABTestEndSitePageTestParams
import com.hubspot.sdk.models.cms.pages.abtests.ABTestRerunLandingPageTestParams
import com.hubspot.sdk.models.cms.pages.abtests.ABTestRerunSitePageTestParams
import java.util.function.Consumer

interface ABTestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ABTestService

    /** Create a new A/B test variation based on the information provided in the request body. */
    fun createLandingPageVariation(params: ABTestCreateLandingPageVariationParams): PageData =
        createLandingPageVariation(params, RequestOptions.none())

    /** @see createLandingPageVariation */
    fun createLandingPageVariation(
        params: ABTestCreateLandingPageVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageData

    /** @see createLandingPageVariation */
    fun createLandingPageVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageData =
        createLandingPageVariation(
            ABTestCreateLandingPageVariationParams.builder()
                .abTestCreateRequestVNext(abTestCreateRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLandingPageVariation */
    fun createLandingPageVariation(abTestCreateRequestVNext: AbTestCreateRequestVNext): PageData =
        createLandingPageVariation(abTestCreateRequestVNext, RequestOptions.none())

    /** Create a new A/B test variation based on the information provided in the request body. */
    fun createSitePageVariation(params: ABTestCreateSitePageVariationParams): PageData =
        createSitePageVariation(params, RequestOptions.none())

    /** @see createSitePageVariation */
    fun createSitePageVariation(
        params: ABTestCreateSitePageVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageData

    /** @see createSitePageVariation */
    fun createSitePageVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageData =
        createSitePageVariation(
            ABTestCreateSitePageVariationParams.builder()
                .abTestCreateRequestVNext(abTestCreateRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createSitePageVariation */
    fun createSitePageVariation(abTestCreateRequestVNext: AbTestCreateRequestVNext): PageData =
        createSitePageVariation(abTestCreateRequestVNext, RequestOptions.none())

    /** End an active A/B test and designate a winner. */
    fun endLandingPageTest(params: ABTestEndLandingPageTestParams) =
        endLandingPageTest(params, RequestOptions.none())

    /** @see endLandingPageTest */
    fun endLandingPageTest(
        params: ABTestEndLandingPageTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see endLandingPageTest */
    fun endLandingPageTest(
        abTestEndRequestVNext: AbTestEndRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        endLandingPageTest(
            ABTestEndLandingPageTestParams.builder()
                .abTestEndRequestVNext(abTestEndRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see endLandingPageTest */
    fun endLandingPageTest(abTestEndRequestVNext: AbTestEndRequestVNext) =
        endLandingPageTest(abTestEndRequestVNext, RequestOptions.none())

    /** End an active A/B test and designate a winner. */
    fun endSitePageTest(params: ABTestEndSitePageTestParams) =
        endSitePageTest(params, RequestOptions.none())

    /** @see endSitePageTest */
    fun endSitePageTest(
        params: ABTestEndSitePageTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see endSitePageTest */
    fun endSitePageTest(
        abTestEndRequestVNext: AbTestEndRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        endSitePageTest(
            ABTestEndSitePageTestParams.builder()
                .abTestEndRequestVNext(abTestEndRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see endSitePageTest */
    fun endSitePageTest(abTestEndRequestVNext: AbTestEndRequestVNext) =
        endSitePageTest(abTestEndRequestVNext, RequestOptions.none())

    /** Rerun a previous A/B test. */
    fun rerunLandingPageTest(params: ABTestRerunLandingPageTestParams) =
        rerunLandingPageTest(params, RequestOptions.none())

    /** @see rerunLandingPageTest */
    fun rerunLandingPageTest(
        params: ABTestRerunLandingPageTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see rerunLandingPageTest */
    fun rerunLandingPageTest(
        abTestRerunRequestVNext: AbTestRerunRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        rerunLandingPageTest(
            ABTestRerunLandingPageTestParams.builder()
                .abTestRerunRequestVNext(abTestRerunRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see rerunLandingPageTest */
    fun rerunLandingPageTest(abTestRerunRequestVNext: AbTestRerunRequestVNext) =
        rerunLandingPageTest(abTestRerunRequestVNext, RequestOptions.none())

    /** Rerun a previous A/B test. */
    fun rerunSitePageTest(params: ABTestRerunSitePageTestParams) =
        rerunSitePageTest(params, RequestOptions.none())

    /** @see rerunSitePageTest */
    fun rerunSitePageTest(
        params: ABTestRerunSitePageTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see rerunSitePageTest */
    fun rerunSitePageTest(
        abTestRerunRequestVNext: AbTestRerunRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        rerunSitePageTest(
            ABTestRerunSitePageTestParams.builder()
                .abTestRerunRequestVNext(abTestRerunRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see rerunSitePageTest */
    fun rerunSitePageTest(abTestRerunRequestVNext: AbTestRerunRequestVNext) =
        rerunSitePageTest(abTestRerunRequestVNext, RequestOptions.none())

    /** A view of [ABTestService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ABTestService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/ab-test/create-variation`, but is otherwise the same as
         * [ABTestService.createLandingPageVariation].
         */
        @MustBeClosed
        fun createLandingPageVariation(
            params: ABTestCreateLandingPageVariationParams
        ): HttpResponseFor<PageData> = createLandingPageVariation(params, RequestOptions.none())

        /** @see createLandingPageVariation */
        @MustBeClosed
        fun createLandingPageVariation(
            params: ABTestCreateLandingPageVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageData>

        /** @see createLandingPageVariation */
        @MustBeClosed
        fun createLandingPageVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageData> =
            createLandingPageVariation(
                ABTestCreateLandingPageVariationParams.builder()
                    .abTestCreateRequestVNext(abTestCreateRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLandingPageVariation */
        @MustBeClosed
        fun createLandingPageVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext
        ): HttpResponseFor<PageData> =
            createLandingPageVariation(abTestCreateRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/ab-test/create-variation`, but is otherwise the same as
         * [ABTestService.createSitePageVariation].
         */
        @MustBeClosed
        fun createSitePageVariation(
            params: ABTestCreateSitePageVariationParams
        ): HttpResponseFor<PageData> = createSitePageVariation(params, RequestOptions.none())

        /** @see createSitePageVariation */
        @MustBeClosed
        fun createSitePageVariation(
            params: ABTestCreateSitePageVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageData>

        /** @see createSitePageVariation */
        @MustBeClosed
        fun createSitePageVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageData> =
            createSitePageVariation(
                ABTestCreateSitePageVariationParams.builder()
                    .abTestCreateRequestVNext(abTestCreateRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createSitePageVariation */
        @MustBeClosed
        fun createSitePageVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext
        ): HttpResponseFor<PageData> =
            createSitePageVariation(abTestCreateRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/ab-test/end`, but
         * is otherwise the same as [ABTestService.endLandingPageTest].
         */
        @MustBeClosed
        fun endLandingPageTest(params: ABTestEndLandingPageTestParams): HttpResponse =
            endLandingPageTest(params, RequestOptions.none())

        /** @see endLandingPageTest */
        @MustBeClosed
        fun endLandingPageTest(
            params: ABTestEndLandingPageTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see endLandingPageTest */
        @MustBeClosed
        fun endLandingPageTest(
            abTestEndRequestVNext: AbTestEndRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            endLandingPageTest(
                ABTestEndLandingPageTestParams.builder()
                    .abTestEndRequestVNext(abTestEndRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see endLandingPageTest */
        @MustBeClosed
        fun endLandingPageTest(abTestEndRequestVNext: AbTestEndRequestVNext): HttpResponse =
            endLandingPageTest(abTestEndRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/ab-test/end`, but is
         * otherwise the same as [ABTestService.endSitePageTest].
         */
        @MustBeClosed
        fun endSitePageTest(params: ABTestEndSitePageTestParams): HttpResponse =
            endSitePageTest(params, RequestOptions.none())

        /** @see endSitePageTest */
        @MustBeClosed
        fun endSitePageTest(
            params: ABTestEndSitePageTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see endSitePageTest */
        @MustBeClosed
        fun endSitePageTest(
            abTestEndRequestVNext: AbTestEndRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            endSitePageTest(
                ABTestEndSitePageTestParams.builder()
                    .abTestEndRequestVNext(abTestEndRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see endSitePageTest */
        @MustBeClosed
        fun endSitePageTest(abTestEndRequestVNext: AbTestEndRequestVNext): HttpResponse =
            endSitePageTest(abTestEndRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/ab-test/rerun`,
         * but is otherwise the same as [ABTestService.rerunLandingPageTest].
         */
        @MustBeClosed
        fun rerunLandingPageTest(params: ABTestRerunLandingPageTestParams): HttpResponse =
            rerunLandingPageTest(params, RequestOptions.none())

        /** @see rerunLandingPageTest */
        @MustBeClosed
        fun rerunLandingPageTest(
            params: ABTestRerunLandingPageTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see rerunLandingPageTest */
        @MustBeClosed
        fun rerunLandingPageTest(
            abTestRerunRequestVNext: AbTestRerunRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            rerunLandingPageTest(
                ABTestRerunLandingPageTestParams.builder()
                    .abTestRerunRequestVNext(abTestRerunRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see rerunLandingPageTest */
        @MustBeClosed
        fun rerunLandingPageTest(abTestRerunRequestVNext: AbTestRerunRequestVNext): HttpResponse =
            rerunLandingPageTest(abTestRerunRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/ab-test/rerun`, but
         * is otherwise the same as [ABTestService.rerunSitePageTest].
         */
        @MustBeClosed
        fun rerunSitePageTest(params: ABTestRerunSitePageTestParams): HttpResponse =
            rerunSitePageTest(params, RequestOptions.none())

        /** @see rerunSitePageTest */
        @MustBeClosed
        fun rerunSitePageTest(
            params: ABTestRerunSitePageTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see rerunSitePageTest */
        @MustBeClosed
        fun rerunSitePageTest(
            abTestRerunRequestVNext: AbTestRerunRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            rerunSitePageTest(
                ABTestRerunSitePageTestParams.builder()
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
